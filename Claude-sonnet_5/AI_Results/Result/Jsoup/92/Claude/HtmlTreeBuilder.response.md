# การวิเคราะห์และแนวทางการทดสอบ

เนื่องจาก `HtmlTreeBuilder` มีสมาชิกส่วนใหญ่เป็น **package-private** ผมจึงสร้างคลาสทดสอบไว้ใน package เดียวกัน (`org.jsoup.parser`) เพื่อเข้าถึง method เหล่านั้นได้โดยตรง (white-box testing)

**ข้อสังเกตสำคัญ:** ใน `resetInsertionMode()` มีเงื่อนไข
```java
} else if (("td".equals(name) || "th".equals(name) && !last)) {
```
เนื่องจาก `&&` มี precedence สูงกว่า `||` เงื่อนไขนี้จะกลายเป็น `td.equals(name) || (th.equals(name) && !last)` ซึ่งทำให้ "td" ที่เป็น context element ตัวเดียว (`last = true`) ยังคงถูกส่งไปที่ `InCell` ทั้งที่ตาม HTML5 spec ควรจะตกไปที่เงื่อนไข `else if (last)` → `InBody` นี่คือจุดที่เป็น known defect (Jsoup-92b) — ผมเขียนเทสเพื่อ **ดักจับบั๊กนี้โดยเฉพาะ** (จะ fail บนโค้ด buggy และ pass บนโค้ดที่แก้แล้ว) และกำกับคอมเมนต์ไว้ชัดเจน

**ข้อสมมติที่ไม่มีใน source ที่ให้มา** (เป็น dependency class ของ jsoup ที่ทราบจาก public API มาตรฐาน) ผมกำกับด้วยคอมเมนต์ `// ASSUMPTION:` ทุกจุด

```java
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.Assert.*;

/**
 * White-box JUnit4 tests for org.jsoup.parser.HtmlTreeBuilder.
 * Placed in the same package to access package-private members (as per source under test).
 *
 * ASSUMPTION NOTE: Classes Parser, Tag, Element, FormElement, TextNode, Comment, Document
 * are dependencies of HtmlTreeBuilder that are not included in the given source listing.
 * Their public APIs used here (constructors, Jsoup.parse, Parser.htmlParser, setTrackErrors,
 * getErrors, Element.appendChild/parent/childNodes, etc.) are assumed to behave per standard
 * jsoup public API, since no alternate behavior is specified in the given source.
 */
public class HtmlTreeBuilderTest {

    // ---------- helpers ----------

    /** Creates an initialised HtmlTreeBuilder with an empty, controllable stack. */
    private HtmlTreeBuilder newBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        // ASSUMPTION: Parser(TreeBuilder) constructor exists (standard jsoup wiring).
        Parser parser = new Parser(tb);
        // parseFragment (given in source) initialises doc/settings/baseUri/stack/tokeniser.
        tb.parseFragment("", null, "http://example.com/", parser);
        tb.getStack().clear(); // reset stack for isolated unit testing
        return tb;
    }

    private Element elem(String tag) {
        return new Element(Tag.valueOf(tag), "");
    }

    private void setContextElement(HtmlTreeBuilder tb, Element context) throws Exception {
        Field f = HtmlTreeBuilder.class.getDeclaredField("contextElement");
        f.setAccessible(true);
        f.set(tb, context);
    }

    // ---------- simple getters/setters ----------

    @Test
    public void testFramesetOk() {
        HtmlTreeBuilder tb = newBuilder();
        assertTrue(tb.framesetOk()); // default true after init
        tb.framesetOk(false);
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testFosterInserts() {
        HtmlTreeBuilder tb = newBuilder();
        assertFalse(tb.isFosterInserts());
        tb.setFosterInserts(true);
        assertTrue(tb.isFosterInserts());
    }

    @Test
    public void testFormElement() {
        HtmlTreeBuilder tb = newBuilder();
        assertNull(tb.getFormElement());
        FormElement form = new FormElement(Tag.valueOf("form"), "", null);
        tb.setFormElement(form);
        assertSame(form, tb.getFormElement());
    }

    @Test
    public void testHeadElement() {
        HtmlTreeBuilder tb = newBuilder();
        assertNull(tb.getHeadElement());
        Element head = elem("head");
        tb.setHeadElement(head);
        assertSame(head, tb.getHeadElement());
    }

    @Test
    public void testPendingTableCharacters() {
        HtmlTreeBuilder tb = newBuilder();
        List<String> pending = tb.getPendingTableCharacters();
        assertNotNull(pending);
        pending.add("x");
        tb.newPendingTableCharacters();
        assertTrue(tb.getPendingTableCharacters().isEmpty());
        assertNotSame(pending, tb.getPendingTableCharacters());
    }

    @Test
    public void testMarkInsertionModeAndOriginalState() {
        HtmlTreeBuilder tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        tb.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.originalState());
    }

    @Test
    public void testTransitionAndState() {
        HtmlTreeBuilder tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.InCell);
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testIsFragmentParsingDefaultFalse() {
        // boolean field defaults to false before any init call
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(tb.isFragmentParsing());
    }

    @Test
    public void testGetDocumentAndBaseUri() {
        HtmlTreeBuilder tb = newBuilder();
        assertNotNull(tb.getDocument());
        assertEquals("http://example.com/", tb.getBaseUri());
    }

    // ---------- maybeSetBaseUri ----------

    @Test
    public void testMaybeSetBaseUri() {
        HtmlTreeBuilder tb = newBuilder();
        Element base1 = new Element(Tag.valueOf("base"), "");
        base1.attr("href", ""); // empty -> ignored
        tb.maybeSetBaseUri(base1);
        assertEquals("http://example.com/", tb.getBaseUri());

        Element base2 = new Element(Tag.valueOf("base"), "http://example.com/");
        base2.attr("href", "foo/bar.html");
        tb.maybeSetBaseUri(base2); // first real <base href> -> updates
        assertEquals("http://example.com/foo/bar.html", tb.getBaseUri());

        Element base3 = new Element(Tag.valueOf("base"), "http://example.com/");
        base3.attr("href", "other/page.html");
        tb.maybeSetBaseUri(base3); // baseUriSetFromDoc already true -> ignored
        assertEquals("http://example.com/foo/bar.html", tb.getBaseUri());
    }

    // ---------- stack operations ----------

    @Test
    public void testPushPopGetStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = elem("a");
        tb.push(a);
        assertSame(a, tb.getStack().get(0));
        Element popped = tb.pop();
        assertSame(a, popped);
        assertTrue(tb.getStack().isEmpty());
    }

    @Test
    public void testOnStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = elem("a");
        Element b = elem("b");
        tb.push(a);
        assertTrue(tb.onStack(a));
        assertFalse(tb.onStack(b));
    }

    @Test
    public void testGetFromStack() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("div"));
        tb.push(elem("span"));
        assertEquals("span", tb.getFromStack("span").normalName());
        assertNull(tb.getFromStack("table"));
    }

    @Test
    public void testRemoveFromStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = elem("a");
        Element b = elem("b");
        tb.push(a);
        tb.push(b);
        assertTrue(tb.removeFromStack(a));
        assertEquals(1, tb.getStack().size());
        assertFalse(tb.removeFromStack(a)); // already removed -> not found
    }

    @Test
    public void testPopStackToCloseSingleName_matchInMiddle() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("p"));
        tb.push(elem("span"));
        tb.popStackToClose("p"); // pops span, then p (matches, break)
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).normalName());
    }

    @Test
    public void testPopStackToCloseSingleName_noMatchEmptiesStack() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("p"));
        tb.popStackToClose("nonexistent"); // never matches -> removes everything
        assertTrue(tb.getStack().isEmpty());
    }

    @Test
    public void testPopStackToCloseVarargs() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("table"));
        tb.push(elem("tbody"));
        tb.push(elem("tr"));
        // HtmlTreeBuilder.TagSearchTableScope = {"html","table"} (sorted, used with inSorted)
        tb.popStackToClose(HtmlTreeBuilder.TagSearchTableScope);
        assertEquals(1, tb.getStack().size());
        assertEquals("table", tb.getStack().get(0).normalName());
    }

    @Test
    public void testPopStackToBefore() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("tr"));
        tb.popStackToBefore("table"); // removes tr, stops before table (keeps it)
        assertEquals(2, tb.getStack().size());
        assertEquals("table", tb.getStack().get(1).normalName());
    }

    @Test
    public void testClearStackToTableContext_stopsAtHtmlWhenNoMatch() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("div"));
        tb.push(elem("span"));
        tb.clearStackToTableContext(); // no "table" present, stops at html
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).normalName());
    }

    @Test
    public void testClearStackToTableRowContext_immediateMatch() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("tr")); // top already matches -> nothing removed
        tb.clearStackToTableRowContext();
        assertEquals(3, tb.getStack().size());
    }

    @Test
    public void testClearStackToTableBodyAndRowContextRemovesAboveMatch() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("table"));
        tb.push(elem("tbody"));
        tb.push(elem("tr"));
        tb.push(elem("td"));
        tb.clearStackToTableBodyContext(); // removes tr, td; stops at tbody
        assertEquals(2, tb.getStack().size());
        assertEquals("tbody", tb.getStack().get(1).normalName());
    }

    @Test
    public void testAboveOnStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = elem("a");
        Element b = elem("b");
        tb.push(a);
        tb.push(b);
        assertSame(a, tb.aboveOnStack(b));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAboveOnStack_bottomElement_throws() {
        // Known limitation: aboveOnStack does not guard against el being the bottom
        // stack element; stack.get(-1) throws. Not explicitly validated in source.
        HtmlTreeBuilder tb = newBuilder();
        Element a = elem("a");
        tb.push(a);
        tb.aboveOnStack(a);
    }

    @Test
    public void testInsertOnStackAfter_success() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = elem("a");
        Element b = elem("b");
        Element c = elem("c");
        tb.push(a);
        tb.push(b);
        tb.insertOnStackAfter(a, c);
        assertEquals(3, tb.getStack().size());
        assertSame(c, tb.getStack().get(1));
    }

    @Test
    public void testInsertOnStackAfter_notFound_throws() {
        HtmlTreeBuilder tb = newBuilder();
        Element notOnStack = elem("a");
        Element c = elem("c");
        boolean threw = false;
        try {
            tb.insertOnStackAfter(notOnStack, c);
        } catch (Exception e) {
            // ASSUMPTION: Validate.isTrue throws some RuntimeException; exact type not
            // specified in the given source (Validate class not provided).
            threw = true;
        }
        assertTrue(threw);
    }

    @Test
    public void testReplaceOnStack_success_and_notFound() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = elem("a");
        Element b = elem("b");
        tb.push(a);
        tb.replaceOnStack(a, b);
        assertSame(b, tb.getStack().get(0));

        boolean threw = false;
        try {
            tb.replaceOnStack(elem("notThere"), elem("x"));
        } catch (Exception e) {
            threw = true;
        }
        assertTrue(threw);
    }

    // ---------- resetInsertionMode ----------

    @Test
    public void testResetInsertionMode_emptyStack_noChange() {
        HtmlTreeBuilder tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.Initial);
        tb.resetInsertionMode(); // for-loop body never executes
        assertEquals(HtmlTreeBuilderState.Initial, tb.state());
    }

    @Test
    public void testResetInsertionMode_select() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("select"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testResetInsertionMode_tr() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("table"));
        tb.push(elem("tr"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testResetInsertionMode_tbodyTheadTfoot() {
        String[] names = {"tbody", "thead", "tfoot"};
        for (String name : names) {
            HtmlTreeBuilder tb = newBuilder();
            tb.push(elem("table"));
            tb.push(elem(name));
            tb.resetInsertionMode();
            assertEquals("for " + name, HtmlTreeBuilderState.InTableBody, tb.state());
        }
    }

    @Test
    public void testResetInsertionMode_caption() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("table"));
        tb.push(elem("caption"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testResetInsertionMode_colgroup() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("table"));
        tb.push(elem("colgroup"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testResetInsertionMode_table() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testResetInsertionMode_head() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("head"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_body() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("body"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_frameset() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("frameset"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testResetInsertionMode_html() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("div"));
        tb.push(elem("html"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testResetInsertionMode_thNotLast_InCell() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("x"));
        tb.push(elem("th")); // pos != 0 -> last stays false -> right operand true
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionMode_tdNotLast_InCell() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("x"));
        tb.push(elem("td")); // left operand of OR already true
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    /**
     * FAULT-DETECTING TEST (Defects4J Jsoup-92b):
     * Per the javadoc'd HTML5 algorithm referenced in the source, when node is the
     * context element ("last" == true) and is a "td", insertion mode should NOT
     * become InCell; it should fall through to the final "else if (last)" branch
     * -> InBody. Due to missing parentheses:
     *   ("td".equals(name) || "th".equals(name) && !last)
     * the current code evaluates true for "td" regardless of `last`, incorrectly
     * transitioning to InCell. This test asserts the CORRECT (spec) behaviour and
     * is expected to FAIL against the buggy source, demonstrating fault detection.
     */
    @Test
    public void testResetInsertionMode_tdContextElement_last_knownDefect() throws Exception {
        HtmlTreeBuilder tb = newBuilder();
        Element tdContext = elem("td");
        setContextElement(tb, tdContext);
        tb.push(elem("ignoredPlaceholder")); // only size matters; node is overwritten at pos==0
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_unmatchedNameContextLast_InBody() throws Exception {
        HtmlTreeBuilder tb = newBuilder();
        Element ctx = elem("span"); // matches no named branch
        setContextElement(tb, ctx);
        tb.push(elem("placeholder"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    // ---------- scope checks ----------

    @Test
    public void testInScope_trueDirect() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("div"));
        assertTrue(tb.inScope("div"));
    }

    @Test
    public void testInScope_falseHitsBaseType() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("table")); // table is a base-type stopper
        tb.push(elem("div"));
        assertFalse(tb.inScope("p"));
    }

    @Test
    public void testInListItemScope_falseViaExtraType() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("ul")); // ul is extra stopper for list-item scope
        tb.push(elem("p"));
        assertFalse(tb.inListItemScope("li"));
    }

    @Test
    public void testInButtonScope_true() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("button"));
        assertTrue(tb.inButtonScope("button"));
    }

    @Test
    public void testInTableScope_trueFalse() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("table"));
        tb.push(elem("tr"));
        assertFalse(tb.inTableScope("div"));
        assertTrue(tb.inTableScope("table"));
    }

    @Test
    public void testInSelectScope_found() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("optgroup"));
        tb.push(elem("select"));
        assertTrue(tb.inSelectScope("select"));
    }

    @Test
    public void testInSelectScope_falseOutsideList() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("div")); // not in TagSearchSelectScope -> returns false
        tb.push(elem("option"));
        assertFalse(tb.inSelectScope("select"));
    }

    @Test
    public void testInSelectScope_unreachable_throws() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("optgroup"));
        tb.push(elem("option")); // both in TagSearchSelectScope, target never found
        boolean threw = false;
        try {
            tb.inSelectScope("select");
        } catch (Exception e) {
            // ASSUMPTION: Validate.fail() throws some RuntimeException.
            threw = true;
        }
        assertTrue("Expected Validate.fail() to throw", threw);
    }

    @Test
    public void testInScope_maxDepthBoundary() {
        HtmlTreeBuilder tb = newBuilder();
        // target "div" placed below the MaxScopeSearchDepth window -> unreachable
        tb.push(elem("div"));
        for (int i = 0; i < 149; i++) {
            tb.push(elem("span"));
        }
        assertEquals(150, tb.getStack().size());
        assertFalse(tb.inScope("div")); // never reached, loop ends -> final `return false`
    }

    // ---------- generateImpliedEndTags / isSpecial ----------

    @Test
    public void testGenerateImpliedEndTags_noArg_isNoOp() {
        // Per given source, the no-exclude wrapper always passes excludeTag=null,
        // and the while-condition ANDs (excludeTag!=null && ...) with the "in list"
        // check, so with excludeTag==null the loop never runs.
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("p")); // "p" is in TagSearchEndTags
        tb.generateImpliedEndTags();
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testGenerateImpliedEndTags_withExclude_popsUntilNonMatching() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html")); // not in TagSearchEndTags -> stops here
        tb.push(elem("p"));
        tb.push(elem("li"));
        tb.generateImpliedEndTags("span"); // excludeTag never matches current
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).normalName());
    }

    @Test
    public void testGenerateImpliedEndTags_excludeMatchesCurrent_noPop() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.push(elem("p"));
        tb.generateImpliedEndTags("p"); // current equals excludeTag -> loop condition false
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testIsSpecial() {
        HtmlTreeBuilder tb = newBuilder();
        assertTrue(tb.isSpecial(elem("div")));
        assertFalse(tb.isSpecial(elem("span")));
    }

    // ---------- active formatting elements ----------

    @Test
    public void testLastAndRemoveLastFormattingElement() {
        HtmlTreeBuilder tb = newBuilder();
        assertNull(tb.lastFormattingElement());
        assertNull(tb.removeLastFormattingElement());
        Element b = elem("b");
        tb.pushActiveFormattingElements(b);
        assertSame(b, tb.lastFormattingElement());
        assertSame(b, tb.removeLastFormattingElement());
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testPushActiveFormattingElements_duplicateRemovalAtThree() {
        HtmlTreeBuilder tb = newBuilder();
        Element b1 = elem("b");
        Element b2 = elem("b"); // same tag+attributes (both empty) -> "same" formatting element
        Element b3 = elem("b");
        Element b4 = elem("b");
        tb.pushActiveFormattingElements(b1);
        tb.pushActiveFormattingElements(b2);
        tb.pushActiveFormattingElements(b3); // numSeen reaches 3 -> removes earliest (b1)
        tb.pushActiveFormattingElements(b4);
        assertFalse(tb.isInActiveFormattingElements(b1));
        assertTrue(tb.isInActiveFormattingElements(b2));
        assertTrue(tb.isInActiveFormattingElements(b3));
        assertTrue(tb.isInActiveFormattingElements(b4));
    }

    @Test
    public void testPushActiveFormattingElements_markerStopsCounting() {
        HtmlTreeBuilder tb = newBuilder();
        Element b1 = elem("b");
        tb.pushActiveFormattingElements(b1);
        tb.insertMarkerToFormattingElements();
        Element b2 = elem("b");
        Element b3 = elem("b");
        Element b4 = elem("b");
        tb.pushActiveFormattingElements(b2);
        tb.pushActiveFormattingElements(b3);
        tb.pushActiveFormattingElements(b4); // marker encountered before reaching numSeen==3
        assertTrue(tb.isInActiveFormattingElements(b1)); // untouched, behind marker
        assertTrue(tb.isInActiveFormattingElements(b2));
        assertTrue(tb.isInActiveFormattingElements(b3));
        assertTrue(tb.isInActiveFormattingElements(b4));
    }

    @Test
    public void testReconstructFormattingElements_lastNullNoOp() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        tb.reconstructFormattingElements(); // lastFormattingElement() == null -> return
        assertEquals(1, tb.getStack().size());
    }

    @Test
    public void testReconstructFormattingElements_lastOnStackNoOp() {
        HtmlTreeBuilder tb = newBuilder();
        Element b = elem("b");
        tb.push(elem("html"));
        tb.push(b);
        tb.pushActiveFormattingElements(b); // last == b, and b IS on stack -> return
        tb.reconstructFormattingElements();
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testReconstructFormattingElements_pos0Skip_createsNewElement() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(elem("html"));
        Element b = elem("b"); // NOT on stack
        tb.pushActiveFormattingElements(b);
        tb.reconstructFormattingElements();
        assertEquals(2, tb.getStack().size());
        Element newB = tb.getStack().get(1);
        assertEquals("b", newB.normalName());
        assertNotSame(b, newB);
        assertSame(newB, tb.getActiveFormattingElement("b"));
        assertTrue(tb.onStack(newB));
    }

    @Test
    public void testReconstructFormattingElements_entryOnStackBreak() {
        HtmlTreeBuilder tb = newBuilder();
        Element a = elem("a");
        tb.push(elem("html"));
        tb.push(a); // a is on stack
        tb.pushActiveFormattingElements(a);
        Element b = elem("b"); // not on stack
        tb.pushActiveFormattingElements(b);
        tb.reconstructFormattingElements();
        assertEquals(3, tb.getStack().size());
        Element newB = tb.getStack().get(2);
        assertEquals("b", newB.normalName());
        assertSame(newB, tb.getActiveFormattingElement("b"));
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        HtmlTreeBuilder tb = newBuilder();
        tb.pushActiveFormattingElements(elem("b"));
        tb.pushActiveFormattingElements(elem("i"));
        tb.insertMarkerToFormattingElements();
        tb.pushActiveFormattingElements(elem("u"));
        tb.clearFormattingElementsToLastMarker();
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testGetActiveFormattingElement_foundBlockedNotFound() {
        HtmlTreeBuilder tb = newBuilder();
        Element div = elem("div");
        tb.pushActiveFormattingElements(div);
        assertSame(div, tb.getActiveFormattingElement("div")); // found

        tb.insertMarkerToFormattingElements();
        assertNull(tb.getActiveFormattingElement("div")); // blocked by marker above it
        assertNull(tb.getActiveFormattingElement("notPresent"));
    }

    @Test
    public void testReplaceActiveFormattingElementAndRemove() {
        HtmlTreeBuilder tb = newBuilder();
        Element div = elem("div");
        tb.pushActiveFormattingElements(div);
        Element newDiv = elem("div");
        tb.replaceActiveFormattingElement(div, newDiv);
        assertSame(newDiv, tb.getActiveFormattingElement("div"));

        tb.removeFromActiveFormattingElements(newDiv);
        assertFalse(tb.isInActiveFormattingElements(newDiv));
        // removing again (not present) should not throw
        tb.removeFromActiveFormattingElements(newDiv);
    }

    @Test
    public void testInsertMarkerToFormattingElements() {
        HtmlTreeBuilder tb = newBuilder();
        tb.pushActiveFormattingElements(elem("b"));
        tb.insertMarkerToFormattingElements();
        assertNull(tb.removeLastFormattingElement()); // top is the marker (null)
    }

    // ---------- foster parenting ----------

    @Test
    public void testInsertInFosterParent_noTableOnStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element root = elem("html");
        tb.push(root); // no "table" anywhere -> frag fallback: stack.get(0)
        TextNode t = new TextNode("x");
        tb.insertInFosterParent(t);
        assertSame(t, root.childNode(0));
    }

    @Test
    public void testInsertInFosterParent_tableWithParent() {
        HtmlTreeBuilder tb = newBuilder();
        Element body = elem("body");
        Element table = elem("table");
        body.appendChild(table); // table.parent() != null
        tb.push(table);
        TextNode t = new TextNode("x");
        tb.insertInFosterParent(t);
        assertEquals(2, body.childNodes().size());
        assertSame(t, body.childNode(0)); // inserted before table
        assertSame(table, body.childNode(1));
    }

    @Test
    public void testInsertInFosterParent_tableWithoutParent() {
        HtmlTreeBuilder tb = newBuilder();
        Element parentLike = elem("div"); // standalone, not attached to table
        Element table = elem("table"); // table.parent() == null
        tb.push(parentLike);
        tb.push(table);
        TextNode t = new TextNode("x");
        tb.insertInFosterParent(t);
        assertSame(t, parentLike.childNode(0));
    }

    // ---------- insert(Element) / insertNode ----------

    @Test
    public void testInsertElement_emptyStackGoesToDoc() {
        HtmlTreeBuilder tb = newBuilder();
        Element e = elem("div");
        tb.insert(e);
        assertSame(e, tb.getDocument().childNode(0));
        assertEquals(1, tb.getStack().size());
    }

    @Test
    public void testInsertElement_nonEmptyStackAppendsToCurrent() {
        HtmlTreeBuilder tb = newBuilder();
        Element parent = elem("div");
        tb.push(parent);
        Element child = elem("span");
        tb.insert(child);
        assertSame(child, parent.childNode(0));
        assertEquals(2, tb.getStack().size());
    }

    // ---------- parseFragment: tokeniser-state & context-chain branches ----------

    @Test
    public void testParseFragmentContextTitle_usesRcdata_literalText() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = new Parser(tb);
        Element titleCtx = elem("title");
        List<Node> nodes = tb.parseFragment("<p>hi</p>", titleCtx, "http://example.com/", parser);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof TextNode);
        assertEquals("<p>hi</p>", ((TextNode) nodes.get(0)).getWholeText());
    }

    @Test
    public void testParseFragmentContextStyle_usesRawtext_literalText() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = new Parser(tb);
        Element styleCtx = elem("style");
        List<Node> nodes = tb.parseFragment("<p>hi</p>", styleCtx, "http://example.com/", parser);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof TextNode);
    }

    @Test
    public void testParseFragmentContextScript_usesScriptData_literalText() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = new Parser(tb);
        Element scriptCtx = elem("script");
        List<Node> nodes = tb.parseFragment("<p>hi</p>", scriptCtx, "http://example.com/", parser);
        assertEquals(1, nodes.size());
    }

    @Test
    public void testParseFragmentContextNoscript_usesData_parsesElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = new Parser(tb);
        Element noscriptCtx = elem("noscript");
        List<Node> nodes = tb.parseFragment("<p>hi</p>", noscriptCtx, "http://example.com/", parser);
        assertEquals(1, nodes.size());
        assertTrue("expected an actual <p> element (Data state), not literal text",
                nodes.get(0) instanceof Element);
        assertEquals("p", ((Element) nodes.get(0)).tagName());
    }

    @Test
    public void testParseFragmentContextPlaintext_usesData_parsesElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = new Parser(tb);
        Element plaintextCtx = elem("plaintext");
        List<Node> nodes = tb.parseFragment("<p>hi</p>", plaintextCtx, "http://example.com/", parser);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
    }

    @Test
    public void testParseFragmentContextDefault_usesData_parsesElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = new Parser(tb);
        Element divCtx = elem("div");
        List<Node> nodes = tb.parseFragment("<p>hi</p>", divCtx, "http://example.com/", parser);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("p", ((Element) nodes.get(0)).tagName());
    }

    @Test
    public void testParseFragmentFormAncestor_linksFormElement() {
        Document doc2 = Jsoup.parse("<form><div id=ctx></div></form>");
        Element ctx = doc2.getElementById("ctx");
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = new Parser(tb);
        tb.parseFragment("", ctx, "http://example.com/", parser);
        assertNotNull(tb.getFormElement());
        assertTrue(tb.getFormElement() instanceof FormElement);
        assertEquals("form", tb.getFormElement().tagName());
    }

    @Test
    public void testParseFragmentNoFormAncestor_leavesFormElementNull() {
        Document doc2 = Jsoup.parse("<div><span id=ctx></span></div>");
        Element ctx = doc2.getElementById("ctx");
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = new Parser(tb);
        tb.parseFragment("", ctx, "http://example.com/", parser);
        assertNull(tb.getFormElement());
    }

    @Test
    public void testParseFragmentNullContext_returnsDocChildNodes() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Parser parser = new Parser(tb);
        List<Node> nodes = tb.parseFragment("hello", null, "http://example.com/", parser);
        assertNotNull(nodes); // returned doc.childNodes() branch (context == null)
    }

    // ---------- integration tests via public Jsoup API (Token-dependent code paths) ----------

    @Test
    public void testIntegration_commentParsing() {
        Document doc = Jsoup.parse("<!-- hi -->");
        boolean found = false;
        for (Node n : doc.childNodes()) {
            found |= containsComment(n);
        }
        assertTrue(found);
    }

    private boolean containsComment(Node n) {
        if (n instanceof Comment) return true;
        for (Node c : n.childNodes()) {
            if (containsComment(c)) return true;
        }
        return false;
    }

    @Test
    public void testIntegration_scriptContentAsDataNode() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.data().contains("var a = 1;"));
    }

    @Test
    public void testIntegration_selfClosingUnknownTag_noException() {
        Document doc = Jsoup.parse("<custom/>text");
        assertEquals(1, doc.select("custom").size());
    }

    @Test
    public void testIntegration_voidSelfClosing_noError() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<br/>", "http://example.com/");
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testIntegration_nonVoidSelfClosing_producesError() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<div/>text", "http://example.com/");
        assertTrue(parser.getErrors().size() >= 1);
    }

    @Test
    public void testIntegration_fosterParentingStrayTextBeforeTable() {
        Document doc = Jsoup.parse("<table>X<td>Y</td></table>");
        assertEquals("Y", doc.select("td").text());
        // "X" is foster-parented out of the table, ending up as text of body
        assertTrue(doc.body().text().contains("X"));
    }

    @Test
    public void testIntegration_formListedElementLinksToFormElement() {
        Document doc = Jsoup.parse("<form><input name=a></form>");
        FormElement form = (FormElement) doc.select("form").first();
        assertNotNull(form);
        assertEquals(1, form.elements().size());
    }
}
```

## สรุปตาราง Test Method → Branch/Condition ที่ครอบคลุม

| กลุ่ม | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| Getter/Setter | testFramesetOk, testFosterInserts, testFormElement, testHeadElement, testPendingTableCharacters, testMarkInsertionModeAndOriginalState, testTransitionAndState, testIsFragmentParsingDefaultFalse, testGetDocumentAndBaseUri | ค่า default/ค่าหลัง set ของทุก field getter/setter |
| maybeSetBaseUri | testMaybeSetBaseUri | href ว่าง(ignore), href ไม่ว่าง(set ครั้งแรก), baseUriSetFromDoc=true(ignore ครั้งถัดไป) |
| Stack ops | testPushPopGetStack...testReplaceOnStack_success_and_notFound | push/pop, onStack true/false, getFromStack found/not found, removeFromStack found/not found, popStackToClose match-กลาง/ไม่match(emptied), varargs, popStackToBefore, clearStackToContext (match ทันที vs ไล่จนถึง html vs ไล่จน match), aboveOnStack ปกติ/throw, insertOnStackAfter/replaceOnStack success/throw |
| resetInsertionMode | testResetInsertionMode_* (15 methods) | ทุก else-if (select, tr, tbody/thead/tfoot, caption, colgroup, table, head, body, frameset, html), td/th กับ last=false, **td-context-last (known defect, คาดหวังพัง)**, unmatched-name+last→InBody, empty stack (loop ไม่รัน) |
| Scope | testInScope_*, testInListItemScope_*, testInButtonScope_true, testInTableScope_*, testInSelectScope_*, testInScope_maxDepthBoundary | true/false ของ inSpecificScope, extraTypes null/ไม่null, Validate.fail path, ขอบเขต MaxScopeSearchDepth และ fallback `return false` สุดท้าย |
| ImpliedEndTags/Special | testGenerateImpliedEndTags_* , testIsSpecial | excludeTag==null(no-op ตามตรรกะจริงของ source), exclude ไม่ตรง current(pop จนสุด), exclude ตรง current(ไม่ pop), isSpecial true/false |
| Formatting elements | test*FormattingElement* (10 methods) | numSeen==3 remove, marker หยุดนับ, reconstruct: last==null, last onStack, pos==0 skip, entry onStack break, marker/clear/remove/replace/get blocked-by-marker |
| Foster parent | testInsertInFosterParent_* (3 methods) | lastTable==null(frag), lastTable.parent()!=null(before), lastTable.parent()==null(aboveOnStack) |
| insert(Element) | testInsertElement_* | stack.isEmpty()→doc, !isEmpty→currentElement |
| parseFragment | testParseFragmentContext_* (8 methods) | if/else-if ทุกสาขาของ tokeniser.transition (title/textarea, iframe/noembed/.../style/xmp, script, noscript, plaintext, default), context!=null/null, formElement ancestor พบ/ไม่พบ |
| Integration (Jsoup API) | testIntegration_* (7 methods) | self-closing(insert/insertEmpty known-empty/known-non-empty/unknown), comment insert, script DataNode, foster parenting จริง, form-listed element เชื่อมกับ FormElement |

**ข้อควรระวังสำหรับผู้ตรวจ:** test `testResetInsertionMode_tdContextElement_last_kn