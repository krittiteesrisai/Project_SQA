package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import org.junit.Test;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    // ---------- helpers ----------

    private HtmlTreeBuilder newBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        return tb;
    }

    private Element el(String tagName) {
        return new Element(Tag.valueOf(tagName), "http://example.com/");
    }

    private void setContextElement(HtmlTreeBuilder tb, Element context) throws Exception {
        Field f = HtmlTreeBuilder.class.getDeclaredField("contextElement");
        f.setAccessible(true);
        f.set(tb, context);
    }

    private void setCurrentToken(HtmlTreeBuilder tb, Token token) throws Exception {
        Field f = TreeBuilder.class.getDeclaredField("currentToken");
        f.setAccessible(true);
        f.set(tb, token);
    }

    // ---------- initialiseParse / basic state ----------

    @Test
    public void testInitialiseParse_ResetsDefaults() {
        HtmlTreeBuilder tb = newBuilder();
        assertEquals(HtmlTreeBuilderState.Initial, tb.state());
        assertNull(tb.originalState());
        assertFalse(tb.isFragmentParsing());
        assertTrue(tb.framesetOk());
        assertNull(tb.getHeadElement());
        assertNull(tb.getFormElement());
        assertNotNull(tb.getPendingTableCharacters());
        assertTrue(tb.getPendingTableCharacters().isEmpty());
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testFramesetOkGetSet() {
        HtmlTreeBuilder tb = newBuilder();
        tb.framesetOk(false);
        assertFalse(tb.framesetOk());
        tb.framesetOk(true);
        assertTrue(tb.framesetOk());
    }

    @Test
    public void testTransitionStateAndMarkOriginal() {
        HtmlTreeBuilder tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        tb.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.originalState());
    }

    @Test
    public void testGetDocumentAndBaseUri() {
        HtmlTreeBuilder tb = newBuilder();
        assertNotNull(tb.getDocument());
        assertEquals("http://example.com/", tb.getBaseUri());
    }

    @Test
    public void testHeadAndFormElementAccessors() {
        HtmlTreeBuilder tb = newBuilder();
        Element head = el("head");
        tb.setHeadElement(head);
        assertSame(head, tb.getHeadElement());

        FormElement fe = new FormElement(Tag.valueOf("form"), "http://example.com/", null);
        tb.setFormElement(fe);
        assertSame(fe, tb.getFormElement());
    }

    @Test
    public void testPendingTableCharacters() {
        HtmlTreeBuilder tb = newBuilder();
        List<String> custom = new java.util.ArrayList<>();
        custom.add("x");
        tb.setPendingTableCharacters(custom);
        assertSame(custom, tb.getPendingTableCharacters());
        tb.newPendingTableCharacters();
        assertNotSame(custom, tb.getPendingTableCharacters());
        assertTrue(tb.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void testToString_NoException() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html")); // avoid empty-stack currentElement() uncertainty
        String s = tb.toString();
        assertNotNull(s);
        assertTrue(s.contains("TreeBuilder{"));
    }

    // ---------- maybeSetBaseUri ----------

    @Test
    public void testMaybeSetBaseUri_SetsOnceThenIgnoresSubsequent() {
        HtmlTreeBuilder tb = newBuilder();
        Element base1 = el("base");
        base1.attr("href", "http://first.com/");
        tb.maybeSetBaseUri(base1);
        assertEquals("http://first.com/", tb.getBaseUri());
        assertEquals("http://first.com/", tb.getDocument().baseUri());

        Element base2 = el("base");
        base2.attr("href", "http://second.com/");
        tb.maybeSetBaseUri(base2); // ignored: baseUriSetFromDoc already true
        assertEquals("http://first.com/", tb.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUri_EmptyHrefIgnored() {
        HtmlTreeBuilder tb = newBuilder();
        Element base = el("base"); // no href attribute set
        tb.maybeSetBaseUri(base);
        assertEquals("http://example.com/", tb.getBaseUri()); // unchanged
    }

    // ---------- insert(Element)/insertStartTag/insertNode branches ----------

    @Test
    public void testInsertStartTag_EmptyStackGoesToDoc_ThenToCurrentElement() {
        HtmlTreeBuilder tb = newBuilder();
        Element html = tb.insertStartTag("html");
        assertEquals(1, tb.getStack().size());
        assertSame(html, tb.getDocument().childNode(0));

        Element body = tb.insertStartTag("body");
        assertEquals(2, tb.getStack().size());
        assertSame(body, html.childNode(0));
    }

    @Test
    public void testInsertNode_FosterInsertBranch() {
        HtmlTreeBuilder tb = newBuilder();
        Element table = tb.insertStartTag("table"); // appended to doc, stack=[table]
        tb.setFosterInserts(true);
        Element div = tb.insertStartTag("div"); // should be fostered before table
        assertSame(div, table.previousSibling());
        assertEquals(2, tb.getStack().size());
    }

    // ---------- pop/push/getStack/onStack/getFromStack/removeFromStack ----------

    @Test
    public void testPushPopGetStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = el("a");
        tb.push(a);
        assertEquals(1, tb.getStack().size());
        assertSame(a, tb.pop());
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testOnStack_TrueFalse() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = el("a");
        Element b = el("b");
        tb.push(a);
        assertTrue(tb.onStack(a));
        assertFalse(tb.onStack(b));
    }

    @Test
    public void testGetFromStack_FoundNotFound() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("div"));
        tb.push(el("span"));
        assertNotNull(tb.getFromStack("div"));
        assertNull(tb.getFromStack("p"));
    }

    @Test
    public void testRemoveFromStack_FoundNotFound() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = el("a");
        tb.push(a);
        assertTrue(tb.removeFromStack(a));
        assertEquals(0, tb.getStack().size());
        assertFalse(tb.removeFromStack(a)); // already removed
    }

    // ---------- popStackToClose / popStackToBefore ----------

    @Test
    public void testPopStackToClose_SingleName_Found() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("div"));
        tb.push(el("p"));
        tb.popStackToClose("div");
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).tagName());
    }

    @Test
    public void testPopStackToClose_SingleName_NotFound_ExhaustsStack() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("a"));
        tb.push(el("b"));
        tb.popStackToClose("zzz");
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testPopStackToClose_Varargs() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("div"));
        tb.popStackToClose("div", "span"); // sorted array as required by inSorted
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).tagName());
    }

    @Test
    public void testPopStackToBefore() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("div"));
        tb.push(el("p"));
        tb.popStackToBefore("div");
        assertEquals(2, tb.getStack().size());
        assertEquals("div", tb.getStack().get(1).tagName());
    }

    // ---------- clearStackToXXXContext ----------

    @Test
    public void testClearStackToTableContext() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("div"));
        tb.clearStackToTableContext();
        assertEquals(2, tb.getStack().size());
        assertEquals("table", tb.getStack().get(1).tagName());
    }

    @Test
    public void testClearStackToTableBodyContext() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("tbody"));
        tb.push(el("tr"));
        tb.clearStackToTableBodyContext();
        assertEquals(2, tb.getStack().size());
        assertEquals("tbody", tb.getStack().get(1).tagName());
    }

    @Test
    public void testClearStackToTableRowContext() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("tr"));
        tb.push(el("td"));
        tb.clearStackToTableRowContext();
        assertEquals(2, tb.getStack().size());
        assertEquals("tr", tb.getStack().get(1).tagName());
    }

    // ---------- aboveOnStack / insertOnStackAfter / replaceOnStack ----------

    @Test
    public void testAboveOnStack_Normal() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = el("a"), b = el("b"), c = el("c");
        tb.push(a); tb.push(b); tb.push(c);
        assertSame(b, tb.aboveOnStack(c));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAboveOnStack_BottomElement_ThrowsBoundaryCase() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = el("a");
        tb.push(a); // only element, at index 0
        tb.aboveOnStack(a); // stack.get(-1) -> exception (boundary case from source logic)
    }

    @Test
    public void testInsertOnStackAfter() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = el("a"), b = el("b"), n = el("n");
        tb.push(a); tb.push(b);
        tb.insertOnStackAfter(a, n);
        assertEquals(3, tb.getStack().size());
        assertSame(n, tb.getStack().get(1));
    }

    @Test
    public void testReplaceOnStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = el("a"), b = el("b"), n = el("n");
        tb.push(a); tb.push(b);
        tb.replaceOnStack(b, n);
        assertEquals(2, tb.getStack().size());
        assertSame(n, tb.getStack().get(1));
    }

    // ---------- resetInsertionMode (branch-by-branch) ----------

    @Test
    public void testResetInsertionMode_Select() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("select"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testResetInsertionMode_ThWithLastFalse_InCell() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("th"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionMode_Tr() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("tr"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testResetInsertionMode_TbodyTheadTfoot() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("tbody"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_Caption() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("caption"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testResetInsertionMode_Colgroup() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("colgroup"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testResetInsertionMode_Table() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("table"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testResetInsertionMode_Head() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("head"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_Body() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("body"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_Frameset() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("frameset"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testResetInsertionMode_Html() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("span")); tb.push(el("html"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testResetInsertionMode_FallbackLast_UnmatchedTag() throws Exception {
        HtmlTreeBuilder tb = newBuilder();
        setContextElement(tb, el("span")); // matches no named branch
        tb.push(el("dummy")); // size=1 -> pos 0 immediately, node=contextElement
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_ThWithLastTrue_FallbackInBody() throws Exception {
        HtmlTreeBuilder tb = newBuilder();
        setContextElement(tb, el("th"));
        tb.push(el("dummy"));
        tb.resetInsertionMode();
        // th && last=true -> "th".equals && !last == false; falls through to else-if(last) -> InBody
        // same result for both buggy and fixed source (no defect exposed here).
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    /**
     * ทดสอบนี้เขียนตามพฤติกรรม "ที่ถูกต้องตามสเปค HTML5" สำหรับ resetInsertionMode:
     * "if node is td/th AND last is false -> InCell". เมื่อ last=true และ name="td"
     * ตามสเปคที่ถูกต้องไม่ควรเข้า InCell แต่ควร fallback ไปที่ else-if(last) -> InBody
     * ทว่าซอร์สที่ให้มามี operator-precedence bug:
     *   "td".equals(name) || "th".equals(name) && !last
     * ทำให้ name=="td" เข้า InCell เสมอไม่ว่า last จะเป็นอะไร (ไม่มีวงเล็บคลุม || ทั้งก้อน)
     * ดังนั้นเทสนี้ "คาดหวังพฤติกรรมที่ถูกต้อง" และมีแนวโน้ม FAIL กับซอร์สที่ให้มา
     * -- นี่คือจุดประสงค์เพื่อดักจับ fault จริงของ Jsoup-68b
     */
    @Test
    public void testResetInsertionMode_Td_LastTrue_ExposesKnownDefect() throws Exception {
        HtmlTreeBuilder tb = newBuilder();
        setContextElement(tb, el("td"));
        tb.push(el("dummy")); // stack size 1 -> last=true, node=contextElement("td")
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // expected per spec; buggy code gives InCell
    }

    // ---------- inScope family ----------

    @Test
    public void testInScope_True() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html")); tb.push(el("div"));
        assertTrue(tb.inScope("div"));
    }

    @Test
    public void testInScope_FalseHitsBaseType() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html")); tb.push(el("table")); tb.push(el("span"));
        assertFalse(tb.inScope("div")); // stops at "table" (base type) before reaching html
    }

    @Test
    public void testInScope_MaxScopeSearchDepthClamp() {
        HtmlTreeBuilder tb = newBuilder();
        for (int i = 0; i < 110; i++) {
            if (i == 105)
                tb.push(el("target"));
            else
                tb.push(el("span"));
        }
        // target at index 105 is outside searched window [0,100] due to MaxScopeSearchDepth clamp
        assertFalse(tb.inScope("target"));
    }

    @Test
    public void testInListItemScope() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html")); tb.push(el("ul")); tb.push(el("li"));
        assertTrue(tb.inListItemScope("li"));

        HtmlTreeBuilder tb2 = newBuilder();
        tb2.push(el("html")); tb2.push(el("ul"));
        assertFalse(tb2.inListItemScope("li")); // blocked by "ul" extra type
    }

    @Test
    public void testInButtonScope() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html")); tb.push(el("button")); tb.push(el("p"));
        assertTrue(tb.inButtonScope("p"));

        HtmlTreeBuilder tb2 = newBuilder();
        tb2.push(el("html")); tb2.push(el("button"));
        assertFalse(tb2.inButtonScope("p")); // blocked by "button" extra type
    }

    @Test
    public void testInTableScope() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("table")); tb.push(el("div"));
        assertTrue(tb.inTableScope("div"));

        HtmlTreeBuilder tb2 = newBuilder();
        tb2.push(el("table"));
        assertFalse(tb2.inTableScope("div")); // "table" is base type, hit first
    }

    @Test
    public void testInSelectScope_True() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("select")); tb.push(el("option"));
        assertTrue(tb.inSelectScope("select"));
    }

    @Test
    public void testInSelectScope_FalseDueToDisallowedElement() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("select")); tb.push(el("div"));
        assertFalse(tb.inSelectScope("select")); // "div" not allowed, blocks before reaching "select"
    }

    @Test
    public void testInSelectScope_EmptyStack_ThrowsOnValidateFail() {
        HtmlTreeBuilder tb = newBuilder(); // stack empty
        try {
            tb.inSelectScope("option");
            fail("Expected an exception from Validate.fail() when loop never returns");
        } catch (Exception e) {
            // exact exception type not specified in given source (Validate class not shown);
            // we only assert that *some* exception is thrown.
        }
    }

    // ---------- generateImpliedEndTags ----------

    @Test
    public void testGenerateImpliedEndTags_PopsMatchingUntilNonMatch() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("body")); tb.push(el("p")); tb.push(el("li"));
        tb.generateImpliedEndTags();
        assertEquals(1, tb.getStack().size());
        assertEquals("body", tb.getStack().get(0).tagName());
    }

    @Test
    public void testGenerateImpliedEndTags_ExcludeTagStopsLoop() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("body")); tb.push(el("p"));
        tb.generateImpliedEndTags("p"); // current element equals excludeTag -> loop body never runs
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testGenerateImpliedEndTags_NoMatch_NoPop() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("body"));
        tb.generateImpliedEndTags();
        assertEquals(1, tb.getStack().size());
    }

    // ---------- isSpecial ----------

    @Test
    public void testIsSpecial_TrueFalse() {
        HtmlTreeBuilder tb = newBuilder();
        assertTrue(tb.isSpecial(el("div")));
        assertFalse(tb.isSpecial(el("span"))); // "span" is not in TagSearchSpecial
    }

    // ---------- formatting elements ----------

    @Test
    public void testLastAndRemoveLastFormattingElement_EmptyIsNull() {
        HtmlTreeBuilder tb = newBuilder();
        assertNull(tb.lastFormattingElement());
        assertNull(tb.removeLastFormattingElement());
    }

    @Test
    public void testPushActiveFormattingElements_MarkerStopsScan() {
        HtmlTreeBuilder tb = newBuilder();
        Element b1 = el("b"), b2 = el("b"), b3 = el("b"), b4 = el("b"), b5 = el("b");
        tb.pushActiveFormattingElements(b1);
        tb.pushActiveFormattingElements(b2);
        tb.insertMarkerToFormattingElements();
        tb.pushActiveFormattingElements(b3);
        tb.pushActiveFormattingElements(b4);
        tb.pushActiveFormattingElements(b5); // scan stops at marker, numSeen never reaches 3

        assertSame(b5, tb.removeLastFormattingElement());
        assertSame(b4, tb.removeLastFormattingElement());
        assertSame(b3, tb.removeLastFormattingElement());
        assertNull(tb.removeLastFormattingElement());   // marker
        assertSame(b2, tb.removeLastFormattingElement());
        assertSame(b1, tb.removeLastFormattingElement());
        assertNull(tb.removeLastFormattingElement());    // empty
    }

    @Test
    public void testPushActiveFormattingElements_RemovesThirdDuplicate() {
        HtmlTreeBuilder tb = newBuilder();
        Element b1 = el("b"), b2 = el("b"), b3 = el("b"), b4 = el("b");
        tb.pushActiveFormattingElements(b1);
        tb.pushActiveFormattingElements(b2);
        tb.pushActiveFormattingElements(b3);
        tb.pushActiveFormattingElements(b4); // 3rd duplicate scanning back -> b1 removed

        assertFalse(tb.isInActiveFormattingElements(b1));
        assertSame(b4, tb.removeLastFormattingElement());
        assertSame(b3, tb.removeLastFormattingElement());
        assertSame(b2, tb.removeLastFormattingElement());
        assertNull(tb.removeLastFormattingElement()); // confirms size was exactly 3
    }

    @Test
    public void testReconstructFormattingElements_LastNull_NoOp() {
        HtmlTreeBuilder tb = newBuilder();
        tb.reconstructFormattingElements(); // no formatting elements -> immediate return
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testReconstructFormattingElements_LastOnStack_NoOp() {
        HtmlTreeBuilder tb = newBuilder();
        Element b = el("b");
        tb.push(b);
        tb.pushActiveFormattingElements(b); // same element on stack too
        tb.reconstructFormattingElements(); // onStack(last) true -> returns immediately
        assertEquals(1, tb.getStack().size());
    }

    @Test
    public void testReconstructFormattingElements_CreatesNewElementAndAttributes() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("body")); // currentElement() target for insertStartTag
        Element orig = el("b");
        orig.attr("class", "x");
        tb.pushActiveFormattingElements(orig); // NOT on real stack

        tb.reconstructFormattingElements();

        assertEquals(2, tb.getStack().size());
        Element top = tb.getStack().get(1);
        assertEquals("b", top.tagName());
        assertEquals("x", top.attr("class"));
        assertNotSame(orig, top);               // replaced by a cloneish new element
        assertSame(top, tb.lastFormattingElement()); // formattingElements.set(pos, newEl)
        assertFalse(tb.isInActiveFormattingElements(orig));
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = el("a"), b = el("b"), c = el("c"), d = el("d");
        tb.pushActiveFormattingElements(a);
        tb.pushActiveFormattingElements(b);
        tb.insertMarkerToFormattingElements();
        tb.pushActiveFormattingElements(c);
        tb.pushActiveFormattingElements(d);

        tb.clearFormattingElementsToLastMarker();

        assertSame(b, tb.removeLastFormattingElement());
        assertSame(a, tb.removeLastFormattingElement());
        assertNull(tb.removeLastFormattingElement());
    }

    @Test
    public void testRemoveFromActiveFormattingElements_FoundAndNotFound() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = el("a"), b = el("b");
        tb.pushActiveFormattingElements(a);
        tb.removeFromActiveFormattingElements(a);
        assertFalse(tb.isInActiveFormattingElements(a));

        tb.pushActiveFormattingElements(a);
        tb.removeFromActiveFormattingElements(b); // not present -> no-op, no exception
        assertTrue(tb.isInActiveFormattingElements(a));
    }

    @Test
    public void testGetActiveFormattingElement_FoundBeforeMarker_AndBlockedByMarker() {
        HtmlTreeBuilder tb = newBuilder();
        Element p1 = el("p");
        tb.pushActiveFormattingElements(p1);
        assertSame(p1, tb.getActiveFormattingElement("p"));

        HtmlTreeBuilder tb2 = newBuilder();
        Element p2 = el("p");
        tb2.pushActiveFormattingElements(p2);
        tb2.insertMarkerToFormattingElements();
        assertNull(tb2.getActiveFormattingElement("p")); // marker blocks search
    }

    @Test
    public void testReplaceActiveFormattingElement() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = el("a"), n = el("n");
        tb.pushActiveFormattingElements(a);
        tb.replaceActiveFormattingElement(a, n);
        assertSame(n, tb.lastFormattingElement());
    }

    @Test
    public void testInsertMarkerToFormattingElements() {
        HtmlTreeBuilder tb = newBuilder();
        tb.insertMarkerToFormattingElements();
        assertNull(tb.lastFormattingElement());
    }

    // ---------- insertInFosterParent ----------

    @Test
    public void testInsertInFosterParent_NoTable_UsesStackBase() {
        HtmlTreeBuilder tb = newBuilder();
        Element body = el("body");
        tb.push(body); // no "table" in stack
        TextNode tn = new TextNode("x");
        tb.insertInFosterParent(tn);
        assertSame(tn, body.childNode(0));
    }

    @Test
    public void testInsertInFosterParent_TableHasParent_InsertsBefore() {
        HtmlTreeBuilder tb = newBuilder();
        Element parentDiv = el("div");
        Element table = el("table");
        parentDiv.appendChild(table); // table.parent() != null
        tb.push(table);
        TextNode tn = new TextNode("x");
        tb.insertInFosterParent(tn);
        assertSame(tn, parentDiv.childNode(0));
        assertSame(table, parentDiv.childNode(1));
    }

    @Test
    public void testInsertInFosterParent_TableNoParent_UsesAboveOnStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element rootEl = el("html");
        Element table = el("table"); // standalone, parent()==null
        tb.push(rootEl);
        tb.push(table);
        TextNode tn = new TextNode("x");
        tb.insertInFosterParent(tn);
        assertSame(tn, rootEl.childNode(0));
    }

    // ---------- parseFragment ----------

    @Test
    public void testParseFragment_NullContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("<p>hi</p>", null, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertTrue(tb.isFragmentParsing());
        assertNull(tb.getFormElement());
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
    }

    @Test
    public void testParseFragment_ContextTitle_RcdataBranch() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("title");
        List<Node> nodes = tb.parseFragment("hello", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertTrue(tb.isFragmentParsing());
    }

    @Test
    public void testParseFragment_ContextIframe_RawtextBranch() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("iframe");
        List<Node> nodes = tb.parseFragment("abc", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragment_ContextScript_ScriptDataBranch() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("script");
        List<Node> nodes = tb.parseFragment("var a=1;", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragment_ContextNoscript_DataBranch() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("noscript");
        List<Node> nodes = tb.parseFragment("x", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragment_ContextPlaintext_DataBranch() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("plaintext");
        List<Node> nodes = tb.parseFragment("x", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragment_ContextDefault_DivBranch() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("div");
        List<Node> nodes = tb.parseFragment("<span>x</span>", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragment_ContextOwnerDocument_QuirksModePropagated() {
        Document realDoc = Jsoup.parse("<html><body><div id=c></div></body></html>");
        realDoc.quirksMode(Document.QuirksMode.quirks);
        Element context = realDoc.getElementById("c");
        assertNotNull(context);
        assertNotNull(context.ownerDocument());

        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<p>x</p>", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
    }

    @Test
    public void testParseFragment_ContextWithFormAncestor_SetsFormElement() {
        Document realDoc = Jsoup.parse("<form id=f><div id=target></div></form>");
        Element context = realDoc.getElementById("target");
        assertNotNull(context);

        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<input name=x>", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(tb.getFormElement());
        assertEquals("form", tb.getFormElement().tagName());
    }

    @Test
    public void testParseFragment_ContextWithoutFormAncestor_FormElementNull() {
        Document realDoc = Jsoup.parse("<div id=target></div>");
        Element context = realDoc.getElementById("target");

        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<p>x</p>", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNull(tb.getFormElement());
    }

    // ---------- error() ----------

    @Test
    public void testError_AddsErrorWhenTrackingEnabled() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        ParseErrorList errors = ParseErrorList.tracking(10);
        tb.initialiseParse(new StringReader(""), "http://example.com/", errors, ParseSettings.htmlDefault);
        setCurrentToken(tb, new Token.EndTag()); // constructor confirmed used in given source
        assertEquals(0, errors.size());
        tb.error(HtmlTreeBuilderState.Initial);
        assertEquals(1, errors.size());
    }

    @Test
    public void testError_NoAddWhenTrackingDisabled() throws Exception {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        ParseErrorList errors = ParseErrorList.noTracking();
        tb.initialiseParse(new StringReader(""), "http://example.com/", errors, ParseSettings.htmlDefault);
        setCurrentToken(tb, new Token.EndTag());
        tb.error(HtmlTreeBuilderState.Initial);
        assertEquals(0, errors.size());
    }

    // ---------- integration-level tests (Token-dependent code paths) ----------

    @Test
    public void testFullParse_KnownVoidSelfClosingTag_NoTokeniserError() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        Document doc = Jsoup.parse("<div><br/></div>", "http://example.com/", parser);
        assertEquals(0, parser.getErrors().size());
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals("br", div.child(0).tagName());
    }

    @Test
    public void testFullParse_KnownNonVoidSelfClosingTag_TokeniserErrorRecorded() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        Jsoup.parse("<div><p/>text</div>", "http://example.com/", parser);
        assertTrue(parser.getErrors().size() > 0); // insertEmpty(): known tag, not empty -> tokeniser.error
    }

    @Test
    public void testFullParse_UnknownSelfClosingTag_MarkedSelfClosing_NoError() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        Document doc = Jsoup.parse("<div><custom-tag/></div>", "http://example.com/", parser);
        assertEquals(0, parser.getErrors().size());
        assertNotNull(doc.select("custom-tag").first());
    }

    @Test
    public void testFullParse_FormElementAssociatesControls() {
        Document doc = Jsoup.parse("<form id=f><input type=text name=x></form>");
        Element form = doc.getElementById("f");
        assertTrue(form instanceof FormElement);
        Elements controls = ((FormElement) form).elements();
        assertEquals(1, controls.size());
        assertEquals("x", controls.get(0).attr("name"));
    }

    @Test
    public void testFullParse_CommentNodeCreated() {
        Document doc = Jsoup.parse("<div><!-- hello --></div>");
        Element div = doc.select("div").first();
        Node n = div.childNode(0);
        assertTrue(n instanceof Comment);
        assertEquals(" hello ", ((Comment) n).getData());
    }

    @Test
    public void testFullParse_ScriptContent_IsDataNode() {
        Document doc = Jsoup.parse("<script>var a=1;</script>");
        Element script = doc.select("script").first();
        assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void testFullParse_StyleContent_IsDataNode() {
        Document doc = Jsoup.parse("<style>body{color:red}</style>");
        Element style = doc.select("style").first();
        assertTrue(style.childNode(0) instanceof DataNode);
    }

    @Test
    public void testFullParse_NormalText_IsTextNode() {
        Document doc = Jsoup.parse("<p>hello world</p>");
        Element p = doc.select("p").first();
        assertTrue(p.childNode(0) instanceof TextNode);
    }

    @Test
    public void testFullParse_MalformedHtml_ErrorsTrackedWhenEnabled() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        Jsoup.parse("<div><p/>oops</div>", "http://example.com/", parser);
        assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testFullParse_MalformedHtml_NoErrorsWhenTrackingDisabled() {
        Parser parser = Parser.htmlParser(); // default: tracking disabled
        Jsoup.parse("<div><p/>oops</div>", "http://example.com/", parser);
        assertEquals(0, parser.getErrors().size());
    }

    // ---------- null / empty / malformed boundary ----------

    @Test
    public void testFullParse_EmptyString_NoException() {
        Document doc = Jsoup.parse("");
        assertNotNull(doc);
    }

    @Test
    public void testFullParse_OnlyText_NoTags() {
        Document doc = Jsoup.parse("just text, no tags");
        assertTrue(doc.body().text().contains("just text"));
    }
}
