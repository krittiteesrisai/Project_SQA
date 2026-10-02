package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Assume;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * JUnit4 test suite for {@link HtmlTreeBuilder}.
 *
 * หมายเหตุสำคัญ (ข้อสมมติฐานที่ไม่สามารถยืนยันได้ 100% จาก source ที่ให้มา เนื่องจากไม่มี source ของ
 * Token, ParseErrorList, Tag, Element, FormElement ให้ดูตรง ๆ - อ้างอิงจาก signature/การเรียกใช้ที่ปรากฏ
 * ในซอร์ส HtmlTreeBuilder เอง):
 *  - Token.StartTag มี method name(String) และ field selfClosing (ใช้ใน insertForm เท่านั้นเพื่อลดความเสี่ยง)
 *  - org.jsoup.helper.Validate.* เมื่อ fail จะ throw RuntimeException (ใช้ RuntimeException.class แบบกว้าง
 *    เพื่อไม่ guess exception type ที่แน่นอน)
 *  - ParseErrorList.noTracking()/tracking(int) และ canAddError() มีตามที่ใช้ใน source จริง
 */
public class HtmlTreeBuilderTest {

    private static final String BASE = "http://example.com/";

    private Element el(String tagName) {
        return new Element(Tag.valueOf(tagName), BASE);
    }

    /** builder ที่ผ่าน parse("") มาแล้ว (fields doc/stack/tokeniser/reader/errors ถูก init) */
    private HtmlTreeBuilder freshBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("", BASE, ParseErrorList.noTracking());
        return tb;
    }

    /** builder ที่ stack ถูกบังคับให้มีแค่ [html] แน่นอน เพื่อลดความไม่แน่นอนจาก leftover ของการ parse จริง */
    private HtmlTreeBuilder builderWithCleanStack() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        return tb;
    }

    // ---------------------------------------------------------------
    // parse() / parseFragment()
    // ---------------------------------------------------------------

    @Test
    public void testParseBasicDocument() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><head><title>T</title></head><body><p>Hi</p></body></html>",
                BASE, ParseErrorList.noTracking());
        assertNotNull(doc);
        assertEquals("T", doc.title());
        assertEquals(BASE, tb.getBaseUri());
    }

    @Test
    public void testParseEmptyInputCreatesImpliedStructure() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("", BASE, ParseErrorList.noTracking());
        assertNotNull(doc);
        // HTML5 tree construction ย่อมสร้าง html/head/body แบบปริยาย
        assertNotNull(doc.selectFirst("html"));
        assertNotNull(doc.selectFirst("head"));
        assertNotNull(doc.selectFirst("body"));
        // pop() ห้าม pop "html" -> ควรยังเหลืออยู่บน stack เสมอ
        assertNotNull(tb.getFromStack("html"));
    }

    @Test
    public void testParseFragmentNullContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("<p>Hello</p>", null, BASE, ParseErrorList.noTracking());
        assertTrue(tb.isFragmentParsing());
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
    }

    @Test
    public void testParseFragmentContextTitle() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("title");
        List<Node> nodes = tb.parseFragment("some text", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes); // branch: Rcdata transition (title/textarea)
    }

    @Test
    public void testParseFragmentContextIframe() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("iframe");
        List<Node> nodes = tb.parseFragment("raw", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes); // branch: Rawtext transition
    }

    @Test
    public void testParseFragmentContextScript() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("script");
        List<Node> nodes = tb.parseFragment("var a=1;", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes); // branch: ScriptData transition
    }

    @Test
    public void testParseFragmentContextNoscript() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("noscript");
        List<Node> nodes = tb.parseFragment("x", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes); // branch: noscript -> Data
    }

    @Test
    public void testParseFragmentContextPlaintext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("plaintext");
        List<Node> nodes = tb.parseFragment("x", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes); // branch: plaintext -> Data
    }

    @Test
    public void testParseFragmentContextDefaultTag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("div");
        List<Node> nodes = tb.parseFragment("<span>x</span>", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes); // branch: default -> Data
    }

    @Test
    public void testParseFragmentContextOwnerDocumentQuirksBranch() {
        Document parsed = Jsoup.parse("<html><body><div id=d></div></body></html>");
        Element context = parsed.getElementById("d");
        assertNotNull(context.ownerDocument()); // precondition for branch
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("<p>a</p>", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentContextNoOwnerDocument() {
        Element context = el("div"); // standalone, no owner document -> ownerDocument() == null
        assertNull(context.ownerDocument());
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("<p>a</p>", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentFormAncestorFound() {
        Document parsed = Jsoup.parse("<html><body><form><div id=d></div></form></body></html>");
        Element context = parsed.getElementById("d");
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<input/>", context, BASE, ParseErrorList.noTracking());
        assertNotNull(tb.getFormElement()); // branch: parent instanceof FormElement -> found
    }

    @Test
    public void testParseFragmentFormAncestorNotFound() {
        Element context = el("div"); // no form ancestor at all
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<p>a</p>", context, BASE, ParseErrorList.noTracking());
        assertNull(tb.getFormElement()); // branch: loop ends without match
    }

    // resetInsertionMode branches, exercised via parseFragment with various context tag names
    private HtmlTreeBuilderState resetModeFor(String contextTag) {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el(contextTag);
        tb.parseFragment("", context, BASE, ParseErrorList.noTracking());
        return tb.state();
    }

    @Test
    public void testResetInsertionModeSelect() {
        assertEquals(HtmlTreeBuilderState.InSelect, resetModeFor("select"));
    }

    @Test
    public void testResetInsertionModeTd() {
        // สังเกต: เงื่อนไขใน source คือ ("td".equals(name) || "td".equals(name) && !last)
        // ซึ่งเทียบเท่ากับการเช็คแค่ "td".equals(name) เสมอ (short-circuit ของ || ทำให้ขวาไม่มีผล)
        // อาจเป็น dead-code/bug แต่ทดสอบ behavior จริงตามที่ compile ได้
        assertEquals(HtmlTreeBuilderState.InCell, resetModeFor("td"));
    }

    @Test
    public void testResetInsertionModeTr() {
        assertEquals(HtmlTreeBuilderState.InRow, resetModeFor("tr"));
    }

    @Test
    public void testResetInsertionModeTbody() {
        assertEquals(HtmlTreeBuilderState.InTableBody, resetModeFor("tbody"));
    }

    @Test
    public void testResetInsertionModeCaption() {
        assertEquals(HtmlTreeBuilderState.InCaption, resetModeFor("caption"));
    }

    @Test
    public void testResetInsertionModeColgroup() {
        assertEquals(HtmlTreeBuilderState.InColumnGroup, resetModeFor("colgroup"));
    }

    @Test
    public void testResetInsertionModeTable() {
        assertEquals(HtmlTreeBuilderState.InTable, resetModeFor("table"));
    }

    @Test
    public void testResetInsertionModeHead() {
        assertEquals(HtmlTreeBuilderState.InBody, resetModeFor("head"));
    }

    @Test
    public void testResetInsertionModeBody() {
        assertEquals(HtmlTreeBuilderState.InBody, resetModeFor("body"));
    }

    @Test
    public void testResetInsertionModeFrameset() {
        assertEquals(HtmlTreeBuilderState.InFrameset, resetModeFor("frameset"));
    }

    @Test
    public void testResetInsertionModeHtml() {
        assertEquals(HtmlTreeBuilderState.BeforeHead, resetModeFor("html"));
    }

    @Test
    public void testResetInsertionModeFallbackLast() {
        assertEquals(HtmlTreeBuilderState.InBody, resetModeFor("span"));
    }

    // ---------------------------------------------------------------
    // transition / state / markInsertionMode / originalState / framesetOk
    // ---------------------------------------------------------------

    @Test
    public void testTransitionAndState() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testMarkInsertionModeAndOriginalState() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.transition(HtmlTreeBuilderState.InTable);
        tb.markInsertionMode();
        tb.transition(HtmlTreeBuilderState.InCell);
        assertEquals(HtmlTreeBuilderState.InTable, tb.originalState());
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testFramesetOk() {
        HtmlTreeBuilder tb = freshBuilder();
        assertTrue(tb.framesetOk()); // default true
        tb.framesetOk(false);
        assertFalse(tb.framesetOk());
    }

    // ---------------------------------------------------------------
    // push / pop / stack helpers
    // ---------------------------------------------------------------

    @Test
    public void testPushAndPop() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element div = el("div");
        tb.push(div);
        assertSame(div, tb.getStack().getLast());
        Element popped = tb.pop();
        assertSame(div, popped);
    }

    @Test(expected = RuntimeException.class)
    public void testPopHtmlThrows() {
        HtmlTreeBuilder tb = builderWithCleanStack(); // stack = [html]
        tb.pop(); // ต้อง throw เพราะห้าม pop "html"
    }

    @Test(expected = RuntimeException.class)
    public void testPopTdNotInCellThrows() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("td"));
        // state ปัจจุบันไม่ใช่ InCell (ไม่ได้ transition ไปที่ InCell)
        tb.pop();
    }

    @Test
    public void testPopTdInCellDoesNotThrow() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.transition(HtmlTreeBuilderState.InCell);
        Element td = el("td");
        tb.push(td);
        Element popped = tb.pop();
        assertSame(td, popped);
    }

    @Test
    public void testOnStackTrueFalse() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element div = el("div");
        assertFalse(tb.onStack(div));
        tb.push(div);
        assertTrue(tb.onStack(div));
    }

    @Test
    public void testGetFromStackFoundAndNotFound() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element table = el("table");
        tb.push(table);
        assertSame(table, tb.getFromStack("table"));
        assertNull(tb.getFromStack("nonexistent"));
    }

    @Test
    public void testRemoveFromStackFoundAndNotFound() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element div = el("div");
        tb.push(div);
        assertTrue(tb.removeFromStack(div));
        assertFalse(tb.onStack(div));
        assertFalse(tb.removeFromStack(div)); // ลบไปแล้ว หาไม่พบ
    }

    @Test
    public void testPopStackToCloseFound() {
        HtmlTreeBuilder tb = builderWithCleanStack(); // [html]
        Element d1 = el("div"), d2 = el("div"), d3 = el("div");
        tb.push(d1); tb.push(d2); tb.push(d3);
        tb.popStackToClose("div"); // พบตัวแรกจากบนสุด (d3) แล้ว break
        assertSame(d2, tb.getStack().getLast());
    }

    @Test
    public void testPopStackToCloseNotFoundRemovesAll() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("", BASE, ParseErrorList.noTracking());
        tb.getStack().clear();
        tb.push(el("span"));
        tb.popStackToClose("missing-tag"); // ไม่พบ -> ลบทั้งหมด
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testPopStackToCloseVarargsFound() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element tfoot = el("tfoot");
        tb.push(el("div"));
        tb.push(tfoot);
        tb.popStackToClose(new String[]{"tbody", "thead", "tfoot"});
        assertEquals(1, tb.getStack().size()); // เหลือ html เท่านั้น
    }

    @Test
    public void testPopStackToBeforeFound() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element table = el("table");
        tb.push(table);
        tb.push(el("tr"));
        tb.popStackToBefore("table");
        assertSame(table, tb.getStack().getLast());
    }

    @Test
    public void testPopStackToBeforeNotFoundRemovesAll() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("", BASE, ParseErrorList.noTracking());
        tb.getStack().clear();
        tb.push(el("div"));
        tb.popStackToBefore("missing");
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testClearStackToTableContext() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element table = el("table");
        tb.push(table);
        tb.push(el("tbody"));
        tb.push(el("tr"));
        tb.clearStackToTableContext();
        assertSame(table, tb.getStack().getLast());
    }

    @Test
    public void testClearStackToTableBodyContext() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element tbody = el("tbody");
        tb.push(el("table"));
        tb.push(tbody);
        tb.push(el("tr"));
        tb.clearStackToTableBodyContext();
        assertSame(tbody, tb.getStack().getLast());
    }

    @Test
    public void testClearStackToTableRowContext() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element tr = el("tr");
        tb.push(el("table"));
        tb.push(el("tbody"));
        tb.push(tr);
        tb.push(el("td"));
        tb.clearStackToTableRowContext();
        assertSame(tr, tb.getStack().getLast());
    }

    @Test
    public void testClearStackToContextStopsAtHtmlWhenNoMatch() {
        HtmlTreeBuilder tb = builderWithCleanStack(); // [html]
        tb.push(el("div"));
        tb.clearStackToTableContext(); // ไม่มี "table" -> หยุดที่ "html"
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().getLast().nodeName());
    }

    @Test
    public void testAboveOnStack() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element a = el("a-tag"), b = el("b-tag"), c = el("c-tag");
        tb.push(a); tb.push(b); tb.push(c);
        assertSame(b, tb.aboveOnStack(c));
        assertSame(a, tb.aboveOnStack(b));
    }

    @Test
    public void testInsertOnStackAfter() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element a = el("a-tag");
        tb.push(a);
        Element x = el("x-tag");
        tb.insertOnStackAfter(a, x);
        DescendableLinkedList<Element> stack = tb.getStack();
        assertEquals(x, stack.get(stack.lastIndexOf(a) + 1));
    }

    @Test(expected = RuntimeException.class)
    public void testInsertOnStackAfterInvalidThrows() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.insertOnStackAfter(el("not-on-stack"), el("x"));
    }

    @Test
    public void testReplaceOnStack() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element out = el("div");
        tb.push(out);
        Element in = el("span");
        tb.replaceOnStack(out, in);
        assertFalse(tb.onStack(out));
        assertTrue(tb.onStack(in));
    }

    @Test(expected = RuntimeException.class)
    public void testReplaceOnStackInvalidThrows() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.replaceOnStack(el("not-on-stack"), el("x"));
    }

    // ---------------------------------------------------------------
    // scope checks
    // ---------------------------------------------------------------

    @Test
    public void testInScopeTrueAndFalse() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("table"));
        tb.push(el("tbody"));
        tb.push(el("tr"));
        tb.push(el("td"));
        assertTrue(tb.inScope("td"));
        // "div" ไม่เจอ และ "table" (baseType) จะทำให้ loop คืน false ก่อนถึง html
        assertFalse(tb.inScope("div"));
    }

    @Test
    public void testInScopeArrayOverload() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("td"));
        assertTrue(tb.inScope(new String[]{"a-tag", "td"}));
    }

    @Test
    public void testInListItemScopeExtraTypeBranch() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("ul"));
        tb.push(el("span"));
        // extraTypes = {"ul"} -> เจอ "ul" ก่อนเจอ target "li" -> false
        assertFalse(tb.inListItemScope("li"));
    }

    @Test
    public void testInListItemScopeTrue() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("ul"));
        tb.push(el("li"));
        assertTrue(tb.inListItemScope("li"));
    }

    @Test
    public void testInButtonScope() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("button"));
        tb.push(el("span"));
        assertFalse(tb.inButtonScope("p")); // hit extraType "button" first
    }

    @Test
    public void testInTableScopeTrueAndFalse() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("table"));
        assertTrue(tb.inTableScope("table"));
        assertFalse(tb.inTableScope("tbody")); // baseType "table" reached -> false
    }

    @Test
    public void testInSelectScopeTrue() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("select"));
        tb.push(el("optgroup"));
        tb.push(el("option"));
        assertTrue(tb.inSelectScope("select"));
    }

    @Test
    public void testInSelectScopeFalseOnNonAllowedElement() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("select"));
        tb.push(el("div")); // ไม่ใช่ optgroup/option -> คืน false ทันที
        assertFalse(tb.inSelectScope("select"));
    }

    @Test(expected = RuntimeException.class)
    public void testInScopeUnreachableThrows() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.getStack().clear(); // stack ว่างสนิท -> วน loop ไม่เข้าเลย -> Validate.fail
        tb.inScope("div");
    }

    // ---------------------------------------------------------------
    // head / foster / form / pending table chars
    // ---------------------------------------------------------------

    @Test
    public void testHeadElementGetSet() {
        HtmlTreeBuilder tb = freshBuilder();
        assertNull(tb.getHeadElement());
        Element head = el("head");
        tb.setHeadElement(head);
        assertSame(head, tb.getHeadElement());
    }

    @Test
    public void testFosterInsertsGetSet() {
        HtmlTreeBuilder tb = freshBuilder();
        assertFalse(tb.isFosterInserts());
        tb.setFosterInserts(true);
        assertTrue(tb.isFosterInserts());
    }

    @Test
    public void testFormElementGetSet() {
        HtmlTreeBuilder tb = freshBuilder();
        assertNull(tb.getFormElement());
        FormElement fe = new FormElement(Tag.valueOf("form"), BASE, null);
        tb.setFormElement(fe);
        assertSame(fe, tb.getFormElement());
    }

    @Test
    public void testPendingTableCharacters() {
        HtmlTreeBuilder tb = freshBuilder();
        assertNotNull(tb.getPendingTableCharacters());
        assertEquals(0, tb.getPendingTableCharacters().size());
        tb.newPendingTableCharacters();
        assertEquals(0, tb.getPendingTableCharacters().size());
        java.util.List<Token.Character> list = new java.util.ArrayList<Token.Character>();
        tb.setPendingTableCharacters(list);
        assertSame(list, tb.getPendingTableCharacters());
    }

    // ---------------------------------------------------------------
    // generateImpliedEndTags
    // ---------------------------------------------------------------

    @Test
    public void testGenerateImpliedEndTagsPopsMatchingTags() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("p"));
        tb.generateImpliedEndTags();
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().getLast().nodeName());
    }

    @Test
    public void testGenerateImpliedEndTagsWithExcludeStopsImmediately() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("p"));
        tb.generateImpliedEndTags("p"); // currentElement == excludeTag -> ไม่ pop
        assertEquals(2, tb.getStack().size());
        assertEquals("p", tb.getStack().getLast().nodeName());
    }

    @Test
    public void testGenerateImpliedEndTagsWithExcludeDifferentStillPops() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("li"));
        tb.generateImpliedEndTags("p"); // currentElement "li" != exclude "p", อยู่ใน list -> pop
        assertEquals(1, tb.getStack().size());
    }

    // ---------------------------------------------------------------
    // isSpecial
    // ---------------------------------------------------------------

    @Test
    public void testIsSpecialTrue() {
        HtmlTreeBuilder tb = freshBuilder();
        assertTrue(tb.isSpecial(el("table")));
        assertTrue(tb.isSpecial(el("script")));
    }

    @Test
    public void testIsSpecialFalse() {
        HtmlTreeBuilder tb = freshBuilder();
        assertFalse(tb.isSpecial(el("span")));
    }

    // ---------------------------------------------------------------
    // active formatting elements
    // ---------------------------------------------------------------

    @Test
    public void testPushActiveFormattingElementsNoahsArkClause() {
        HtmlTreeBuilder tb = freshBuilder();
        Element e1 = el("b"), e2 = el("b"), e3 = el("b"), e4 = el("b");
        tb.pushActiveFormattingElements(e1);
        tb.pushActiveFormattingElements(e2);
        tb.pushActiveFormattingElements(e3);
        assertTrue(tb.isInActiveFormattingElements(e1));
        tb.pushActiveFormattingElements(e4); // ตัวที่ 4 แบบเดียวกัน -> เอาตัวเก่าสุด (e1) ออก
        assertFalse(tb.isInActiveFormattingElements(e1));
        assertTrue(tb.isInActiveFormattingElements(e2));
        assertTrue(tb.isInActiveFormattingElements(e3));
        assertTrue(tb.isInActiveFormattingElements(e4));
    }

    @Test
    public void testInsertMarkerStopsSearch() {
        HtmlTreeBuilder tb = freshBuilder();
        Element y = el("u");
        tb.pushActiveFormattingElements(y);
        tb.insertMarkerToFormattingElements();
        assertNull(tb.getActiveFormattingElement("u")); // ถูกบล็อกด้วย marker
    }

    @Test
    public void testGetActiveFormattingElementFoundBeforeMarker() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.insertMarkerToFormattingElements();
        Element x = el("i");
        tb.pushActiveFormattingElements(x);
        assertSame(x, tb.getActiveFormattingElement("i"));
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        HtmlTreeBuilder tb = freshBuilder();
        Element before = el("b");
        tb.pushActiveFormattingElements(before);
        tb.insertMarkerToFormattingElements();
        Element after = el("i");
        tb.pushActiveFormattingElements(after);
        tb.clearFormattingElementsToLastMarker();
        assertFalse(tb.isInActiveFormattingElements(after));
        assertTrue(tb.isInActiveFormattingElements(before));
    }

    @Test
    public void testRemoveFromActiveFormattingElements() {
        HtmlTreeBuilder tb = freshBuilder();
        Element e = el("b");
        tb.pushActiveFormattingElements(e);
        assertTrue(tb.isInActiveFormattingElements(e));
        tb.removeFromActiveFormattingElements(e);
        assertFalse(tb.isInActiveFormattingElements(e));
    }

    @Test
    public void testReplaceActiveFormattingElement() {
        HtmlTreeBuilder tb = freshBuilder();
        Element out = el("b");
        tb.pushActiveFormattingElements(out);
        Element in = el("i");
        tb.replaceActiveFormattingElement(out, in);
        assertFalse(tb.isInActiveFormattingElements(out));
        assertTrue(tb.isInActiveFormattingElements(in));
    }

    @Test(expected = RuntimeException.class)
    public void testReplaceActiveFormattingElementInvalidThrows() {
        HtmlTreeBuilder tb = freshBuilder();
        tb.replaceActiveFormattingElement(el("not-there"), el("x"));
    }

    @Test
    public void testReconstructFormattingElementsEmptyListNoOp() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        int before = tb.getStack().size();
        tb.reconstructFormattingElements(); // size==0 -> early return
        assertEquals(before, tb.getStack().size());
    }

    @Test
    public void testReconstructFormattingElementsLastIsMarkerNoOp() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.insertMarkerToFormattingElements();
        int before = tb.getStack().size();
        tb.reconstructFormattingElements(); // last == null -> early return
        assertEquals(before, tb.getStack().size());
    }

    @Test
    public void testReconstructFormattingElementsLastOnStackNoOp() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element e = el("b");
        tb.push(e);
        tb.pushActiveFormattingElements(e); // อยู่ทั้ง stack และ formattingElements
        int before = tb.getStack().size();
        tb.reconstructFormattingElements(); // onStack(last) == true -> early return
        assertEquals(before, tb.getStack().size());
    }

    @Test
    public void testReconstructFormattingElementsCreatesNewElementOnStack() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element f = el("b"); // ไม่ได้ push เข้า stack -> ไม่ onStack
        tb.pushActiveFormattingElements(f);
        tb.reconstructFormattingElements();
        assertEquals("b", tb.getStack().getLast().nodeName());
        assertSame(tb.getStack().getLast(), tb.getActiveFormattingElement("b"));
    }

    // ---------------------------------------------------------------
    // insertInFosterParent
    // ---------------------------------------------------------------

    @Test
    public void testInsertInFosterParentNoTableUsesFirstOnStack() {
        HtmlTreeBuilder tb = builderWithCleanStack(); // [html], ไม่มี table
        Element html = tb.getStack().get(0);
        TextNode node = new TextNode("x", BASE);
        tb.insertInFosterParent(node);
        assertTrue(html.childNodes().contains(node));
    }

    @Test
    public void testInsertInFosterParentTableHasParent() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element html = tb.getStack().get(0);
        Element table = el("table");
        html.appendChild(table); // table มี parent = html
        tb.push(table);
        TextNode node = new TextNode("x", BASE);
        tb.insertInFosterParent(node);
        assertSame(table, node.nextSibling());
        assertTrue(html.childNodes().contains(node));
    }

    @Test
    public void testInsertInFosterParentTableNoParentUsesAboveOnStack() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element outer = el("div"); // ไม่ attach กับ doc tree ใด ๆ
        Element table = el("table"); // parent() == null
        tb.push(outer);
        tb.push(table);
        TextNode node = new TextNode("x", BASE);
        tb.insertInFosterParent(node);
        assertTrue(outer.childNodes().contains(node));
    }

    // ---------------------------------------------------------------
    // insert(...) family (ไม่ผ่าน tokeniser.emit เพื่อลดความเสี่ยงจากการ guess ของ Token API)
    // ---------------------------------------------------------------

    @Test
    public void testInsertByName() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element created = tb.insert("span");
        assertEquals("span", created.tagName());
        assertSame(created, tb.getStack().getLast());
        assertTrue(tb.getStack().get(0).childNodes().contains(created));
    }

    @Test
    public void testInsertCommentToken() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Token.Comment c = new Token.Comment();
        c.append("hello");
        tb.insert(c);
        Node last = tb.getStack().getLast().childNode(tb.getStack().getLast().childNodeSize() - 1);
        assertTrue(last instanceof Comment);
        assertEquals("hello", ((Comment) last).getData());
    }

    @Test
    public void testInsertCharacterTokenAsTextNode() {
        HtmlTreeBuilder tb = builderWithCleanStack(); // top = "html" (ไม่ใช่ script/style)
        Token.Character ch = new Token.Character();
        ch.data("hello text");
        tb.insert(ch);
        Node last = tb.getStack().getLast().childNode(tb.getStack().getLast().childNodeSize() - 1);
        assertTrue(last instanceof TextNode);
    }

    @Test
    public void testInsertCharacterTokenAsDataNodeInScript() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        tb.push(el("script")); // currentElement = script
        Token.Character ch = new Token.Character();
        ch.data("var a=1;");
        tb.insert(ch);
        Node last = tb.getStack().getLast().childNode(tb.getStack().getLast().childNodeSize() - 1);
        assertTrue(last instanceof DataNode);
    }

    @Test
    public void testInsertNodeStackSizeZeroGoesToDoc() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("", BASE, ParseErrorList.noTracking());
        tb.getStack().clear(); // stack.size() == 0
        Token.Comment c = new Token.Comment();
        c.append("top-level");
        tb.insert(c);
        boolean found = false;
        for (Node n : tb.getDocument().childNodes()) {
            if (n instanceof Comment && ((Comment) n).getData().equals("top-level")) found = true;
        }
        assertTrue(found);
    }

    @Test
    public void testInsertNodeFosterInsertBranch() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Element htmlEl = tb.getStack().get(0);
        tb.setFosterInserts(true);
        Element span = tb.insert("span"); // insertNode -> isFosterInserts() true -> insertInFosterParent
        assertTrue(htmlEl.childNodes().contains(span));
        assertTrue(tb.onStack(span)); // insert(Element) ยัง stack.add() เสมอ
    }

    @Test
    public void testInsertEmptySelfClosingKnownTag() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Token.StartTag st = new Token.StartTag();
        st.name("br");
        st.selfClosing = true;
        Element el = tb.insertEmpty(st);
        assertEquals("br", el.tagName());
        assertTrue(el.tag().isKnownTag());
    }

    @Test
    public void testInsertEmptySelfClosingUnknownTag() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Token.StartTag st = new Token.StartTag();
        st.name("custom-unknown-tag-xyz");
        st.selfClosing = true;
        Element el = tb.insertEmpty(st);
        assertTrue(el.tag().isSelfClosing()); // ถูก setSelfClosing() ให้ใน branch unknown tag
    }

    @Test
    public void testInsertEmptyNotSelfClosing() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Token.StartTag st = new Token.StartTag();
        st.name("div");
        st.selfClosing = false;
        Element el = tb.insertEmpty(st);
        assertEquals("div", el.tagName());
    }

    @Test
    public void testInsertFormOnStackTrue() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Token.StartTag st = new Token.StartTag();
        st.name("form");
        FormElement fe = tb.insertForm(st, true);
        assertTrue(tb.onStack(fe));
        assertSame(fe, tb.getFormElement());
    }

    @Test
    public void testInsertFormOnStackFalse() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Token.StartTag st = new Token.StartTag();
        st.name("form");
        FormElement fe = tb.insertForm(st, false);
        assertFalse(tb.onStack(fe));
        assertSame(fe, tb.getFormElement());
    }

    @Test
    public void testInsertNodeFormListedAssociation() {
        HtmlTreeBuilder tb = builderWithCleanStack();
        Token.StartTag formTag = new Token.StartTag();
        formTag.name("form");
        FormElement fe = tb.insertForm(formTag, true); // ตั้ง formElement และ push ขึ้น stack
        Element input = tb.insert("input"); // "input" เป็น form-listed element
        assertTrue(fe.elements().contains(input)); // branch: formElement != null -> addElement
    }

    @Test
    public void testInsertNodeFormListedNoFormElement() {
        HtmlTreeBuilder tb = builderWithCleanStack(); // formElement == null
        Element input = tb.insert("input"); // ไม่ throw แม้ formElement เป็น null
        assertNotNull(input);
    }

    // ---------------------------------------------------------------
    // maybeSetBaseUri
    // ---------------------------------------------------------------

    @Test
    public void testMaybeSetBaseUriSetsOnFirstCall() {
        HtmlTreeBuilder tb = freshBuilder();
        Element baseEl = new Element(Tag.valueOf("base"), BASE);
        baseEl.attr("href", "newpage.html");
        tb.maybeSetBaseUri(baseEl);
        assertEquals("http://example.com/newpage.html", tb.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriIgnoresEmptyHref() {
        HtmlTreeBuilder tb = freshBuilder();
        String original = tb.getBaseUri();
        Element baseEl = new Element(Tag.valueOf("base"), BASE); // ไม่มี href attribute
        tb.maybeSetBaseUri(baseEl);
        assertEquals(original, tb.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriOnlyListensToFirst() {
        HtmlTreeBuilder tb = freshBuilder();
        Element first = new Element(Tag.valueOf("base"), BASE);
        first.attr("href", "first.html");
        tb.maybeSetBaseUri(first);
        String afterFirst = tb.getBaseUri();

        Element second = new Element(Tag.valueOf("base"), BASE);
        second.attr("href", "second.html");
        tb.maybeSetBaseUri(second);
        assertEquals(afterFirst, tb.getBaseUri()); // ค่าต้องไม่เปลี่ยนจากครั้งที่สอง
    }

    // ---------------------------------------------------------------
    // error()
    // ---------------------------------------------------------------

    @Test
    public void testErrorNotAddedWhenNoTracking() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        ParseErrorList errors = ParseErrorList.noTracking();
        tb.parse("<p>x</p>", BASE, errors);
        int before = errors.size();
        tb.error(tb.state());
        assertEquals(before, errors.size()); // canAddError() == false -> ไม่เพิ่ม
    }

    @Test
    public void testErrorAddedWhenTracking() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        ParseErrorList errors = ParseErrorList.tracking(10);
        tb.parse("<p>x</p>", BASE, errors);
        int before = errors.size();
        tb.error(tb.state());
        assertTrue(errors.size() > before); // canAddError() == true -> เพิ่ม error
    }

    // ---------------------------------------------------------------
    // misc getters / toString
    // ---------------------------------------------------------------

    @Test
    public void testGetDocumentNotNull() {
        HtmlTreeBuilder tb = freshBuilder();
        assertNotNull(tb.getDocument());
    }

    @Test
    public void testToStringNotNull() {
        HtmlTreeBuilder tb = freshBuilder();
        String s = tb.toString();
        assertNotNull(s);
        assertTrue(s.contains("TreeBuilder"));
    }

    @Test
    public void testIsFragmentParsingFlag() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(tb.isFragmentParsing());
        tb.parseFragment("<p>a</p>", null, BASE, ParseErrorList.noTracking());
        assertTrue(tb.isFragmentParsing());
    }
}
