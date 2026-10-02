# วิเคราะห์และแนวทางการทดสอบ

เนื่องจาก `HtmlTreeBuilder` เป็น package-private class ที่มี field/method จำนวนมากเป็น package-private เช่นกัน จึงต้องวางคลาสทดสอบไว้ใน package `org.jsoup.parser` เดียวกัน และต้องใช้เทคนิคดังนี้:

- เมธอดที่ **ไม่ต้องใช้ `Token`** (เช่น stack manipulation, formatting elements, scope checks, resetInsertionMode, insertInFosterParent, insert(Element), insertNode branches) → ทดสอบแบบ **unit test ตรง ๆ**
- เมธอดที่ **ต้องใช้ `Token.StartTag/Comment/Character`** ซึ่ง constructor/setter ภายในไม่ได้แสดงในซอร์สที่ให้มา (ไม่ต้องการเดา API) → ทดสอบแบบ **integration ผ่าน `Jsoup.parse()` / `Parser`** ซึ่งเป็น public API ที่เสถียรของ jsoup
- บาง method ใช้ private field (`contextElement`, `currentToken`) → ใช้ **reflection** เพื่อตั้งค่าสำหรับทดสอบ branch เฉพาะ (คอมเมนต์กำกับไว้ว่าเป็น assumption เรื่อง field name)
- มีจุดที่น่าสงสัยว่าอาจเป็น fault จริงในซอร์ส (ไม่ได้แก้ไข แค่เขียน test จับสภาพปัจจุบัน):
  - `resetInsertionMode()`: เงื่อนไข `"td".equals(name) || "th".equals(name) && !last` เพราะ `&&` มี precedence สูงกว่า `||` ทำให้ `th` ที่ last=true ไม่เข้า `InCell`
  - `generateImpliedEndTags(null)` (ซึ่งถูกเรียกจาก `generateImpliedEndTags()` แบบ no-arg) จะไม่ pop อะไรเลยเพราะ short-circuit ของ `excludeTag != null && ...`
  - `aboveOnStack()` เมื่อ element อยู่ล่างสุดของ stack จะ throw `IndexOutOfBoundsException` (เพราะ `assert` ถูก disable โดย default)

```java
package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.parser.HtmlTreeBuilder (Defects4J Jsoup-67b).
 *
 * หมายเหตุสำคัญ (assumption ที่ไม่สามารถยืนยันได้จากซอร์สที่ให้มาโดยตรง แต่จำเป็นต่อการทดสอบ):
 *  - ใช้ public API มาตรฐานของ jsoup: Jsoup.parse, Parser, Document, Element, FormElement,
 *    Attributes, DataNode, TextNode, DocumentType, Document.QuirksMode, Document.createShell
 *    (เป็น public API ที่มีการใช้งานจริงในซอร์ส ไม่ได้เดา behavior ใหม่)
 *  - Token.EndTag มี no-arg constructor ที่เรียกใช้ได้ (ยืนยันจากซอร์ส: `emptyEnd = new Token.EndTag();`)
 *  - field ชื่อ `currentToken` อยู่ใน superclass TreeBuilder (อนุมานจาก `this.currentToken = token;`)
 *  - field ชื่อ `contextElement` อยู่ใน HtmlTreeBuilder เอง (ยืนยันจากซอร์สตรง ๆ)
 *  - ParseErrorList มี .size() (สมมุติว่า extends ArrayList ตามแบบ jsoup ทั่วไป)
 */
public class HtmlTreeBuilderTest {

    private HtmlTreeBuilder tb;
    private static final String BASE_URI = "http://example.com/";

    @Before
    public void setUp() {
        tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(""), BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
    }

    // ---------- helpers ----------

    private Element elem(String name) {
        return new Element(Tag.valueOf(name), BASE_URI);
    }

    private void setContextElement(Element el) {
        try {
            Field f = HtmlTreeBuilder.class.getDeclaredField("contextElement");
            f.setAccessible(true);
            f.set(tb, el);
        } catch (Exception e) {
            fail("reflection failed: " + e.getMessage());
        }
    }

    private void setCurrentToken(Object token) {
        try {
            Field f = TreeBuilder.class.getDeclaredField("currentToken");
            f.setAccessible(true);
            f.set(tb, token);
        } catch (Exception e) {
            fail("reflection failed: " + e.getMessage());
        }
    }

    // =====================================================================
    // defaultSettings / initialiseParse
    // =====================================================================

    @Test
    public void testDefaultSettings() {
        assertEquals(ParseSettings.htmlDefault, tb.defaultSettings());
    }

    @Test
    public void testInitialiseParseResetsState() {
        tb.push(elem("html")); // ทำให้ stack ไม่ว่างก่อน
        tb.framesetOk(false);
        tb.setFosterInserts(true);

        tb.initialiseParse(new StringReader("x"), "http://foo/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        assertEquals(HtmlTreeBuilderState.Initial, tb.state());
        assertNull(tb.originalState());
        assertFalse(tb.isFragmentParsing());
        assertNull(tb.getHeadElement());
        assertNull(tb.getFormElement());
        assertTrue(tb.framesetOk());
        assertFalse(tb.isFosterInserts());
        assertEquals(0, tb.getPendingTableCharacters().size());
        assertEquals(0, tb.getStack().size());
    }

    // =====================================================================
    // parseFragment
    // =====================================================================

    @Test
    public void testParseFragmentNullContext() {
        List<Node> nodes = tb.parseFragment("<p>Hello</p>", null, BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertTrue(tb.isFragmentParsing());
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragmentContextTitleUsesRcdata() {
        // title/textarea -> Rcdata branch; ตรวจแค่ไม่ throw และผลลัพธ์ไม่ null
        Element context = elem("title");
        List<Node> nodes = tb.parseFragment("some & text", context, BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentContextScript() {
        Element context = elem("script");
        List<Node> nodes = tb.parseFragment("var x=1;", context, BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentContextIframeRawtext() {
        Element context = elem("iframe");
        List<Node> nodes = tb.parseFragment("<raw>", context, BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentContextNoscriptData() {
        Element context = elem("noscript");
        List<Node> nodes = tb.parseFragment("text", context, BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentContextPlaintextData() {
        Element context = elem("plaintext");
        List<Node> nodes = tb.parseFragment("text", context, BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentContextDefaultElseBranch() {
        Element context = elem("div"); // falls into final else -> Data
        List<Node> nodes = tb.parseFragment("<span>hi</span>", context, BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentQuirksModePropagatedFromContextOwnerDocument() {
        Document ownerDoc = Document.createShell(BASE_URI);
        ownerDoc.quirksMode(Document.QuirksMode.quirks);
        Element context = ownerDoc.body(); // context.ownerDocument() != null branch
        tb.parseFragment("<p>hi</p>", context, BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
    }

    @Test
    public void testParseFragmentFindsFormElementInAncestorChain() {
        Document ownerDoc = Document.createShell(BASE_URI);
        FormElement form = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        ownerDoc.body().appendChild(form);
        Element div = elem("div");
        form.appendChild(div);

        tb.parseFragment("<p>hi</p>", div, BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertSame(form, tb.getFormElement());
    }

    @Test
    public void testParseFragmentNoFormAncestorLeavesFormElementNull() {
        Element div = elem("div"); // ไม่มี form บรรพบุรุษ, ไม่มี ownerDocument
        tb.parseFragment("<p>hi</p>", div, BASE_URI, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNull(tb.getFormElement());
    }

    // =====================================================================
    // state / transition / framesetOk / misc getters-setters
    // =====================================================================

    @Test
    public void testTransitionStateMarkOriginal() {
        tb.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        tb.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.originalState());
        tb.transition(HtmlTreeBuilderState.InTable);
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals(HtmlTreeBuilderState.InBody, tb.originalState()); // ไม่เปลี่ยนจนกว่าจะ mark ใหม่
    }

    @Test
    public void testFramesetOkGetterSetter() {
        assertTrue(tb.framesetOk());
        tb.framesetOk(false);
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testFosterInsertsGetterSetter() {
        assertFalse(tb.isFosterInserts());
        tb.setFosterInserts(true);
        assertTrue(tb.isFosterInserts());
    }

    @Test
    public void testHeadElementGetterSetter() {
        assertNull(tb.getHeadElement());
        Element head = elem("head");
        tb.setHeadElement(head);
        assertSame(head, tb.getHeadElement());
    }

    @Test
    public void testFormElementGetterSetter() {
        assertNull(tb.getFormElement());
        FormElement f = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        tb.setFormElement(f);
        assertSame(f, tb.getFormElement());
    }

    @Test
    public void testPendingTableCharacters() {
        assertTrue(tb.getPendingTableCharacters().isEmpty());
        List<String> custom = new ArrayList<>();
        custom.add("abc");
        tb.setPendingTableCharacters(custom);
        assertSame(custom, tb.getPendingTableCharacters());
        tb.newPendingTableCharacters();
        assertNotSame(custom, tb.getPendingTableCharacters());
        assertTrue(tb.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void testGetDocumentAndBaseUri() {
        assertNotNull(tb.getDocument());
        assertEquals(BASE_URI, tb.getBaseUri());
    }

    @Test
    public void testIsFragmentParsingDefaultFalse() {
        assertFalse(tb.isFragmentParsing());
    }

    @Test
    public void testToStringDoesNotThrowWhenStackNonEmpty() {
        tb.push(elem("html"));
        String s = tb.toString();
        assertNotNull(s);
        assertTrue(s.contains("TreeBuilder"));
    }

    // =====================================================================
    // maybeSetBaseUri
    // =====================================================================

    @Test
    public void testMaybeSetBaseUriIgnoresEmptyHref() {
        Element base = elem("base"); // no href attribute -> absUrl("href") length 0
        tb.maybeSetBaseUri(base);
        assertEquals(BASE_URI, tb.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriSetsOnFirstCallOnly() {
        Element base1 = elem("base");
        base1.attr("href", "http://first.example/");
        tb.maybeSetBaseUri(base1);
        assertEquals("http://first.example/", tb.getBaseUri());

        Element base2 = elem("base");
        base2.attr("href", "http://second.example/");
        tb.maybeSetBaseUri(base2); // baseUriSetFromDoc == true -> ignored
        assertEquals("http://first.example/", tb.getBaseUri());
    }

    // =====================================================================
    // error()
    // =====================================================================

    @Test
    public void testErrorAddsWhenTrackingEnabled() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        tb.initialiseParse(new StringReader(""), BASE_URI, errors, ParseSettings.htmlDefault);
        setCurrentToken(new Token.EndTag());
        tb.error(HtmlTreeBuilderState.InBody);
        assertEquals(1, errors.size());
    }

    @Test
    public void testErrorNoOpWhenNotTracking() {
        ParseErrorList errors = ParseErrorList.noTracking();
        tb.initialiseParse(new StringReader(""), BASE_URI, errors, ParseSettings.htmlDefault);
        setCurrentToken(new Token.EndTag());
        tb.error(HtmlTreeBuilderState.InBody);
        assertEquals(0, errors.size());
    }

    // =====================================================================
    // insert(Element) / insertNode branches (ไม่ต้องใช้ Token)
    // =====================================================================

    @Test
    public void testInsertElementWhenStackEmptyGoesToDoc() {
        Element el = elem("html");
        tb.insert(el);
        assertSame(el, tb.getDocument().childNode(tb.getDocument().childNodeSize() - 1));
        assertTrue(tb.getStack().contains(el));
    }

    @Test
    public void testInsertElementAppendsToCurrentElement() {
        Element root = elem("html");
        tb.insert(root);
        Element child = elem("div");
        tb.insert(child);
        assertSame(root, child.parent());
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testInsertElementFosterParenting_LastTableHasParent() {
        Element root = elem("html");
        tb.insert(root);
        Element table = elem("table");
        tb.insert(table); // table appended under root, pushed
        tb.setFosterInserts(true);

        Element fostered = elem("span");
        tb.insert(fostered);

        assertSame(root, fostered.parent());
        int idxFoster = root.children().indexOf(fostered);
        int idxTable = root.children().indexOf(table);
        assertTrue(idxFoster < idxTable); // table.before(in)
    }

    @Test
    public void testInsertElementFosterParenting_NoTableInStackUsesStackBottom() {
        Element root = elem("html");
        tb.insert(root); // only element on stack, no "table"
        tb.setFosterInserts(true);

        Element fostered = elem("span");
        tb.insert(fostered);
        assertSame(root, fostered.parent()); // fosterParent = stack.get(0)
    }

    @Test
    public void testInsertElementFosterParenting_TableWithoutDomParentUsesAboveOnStack() {
        Element html = elem("html");
        Element table = elem("table"); // standalone, never appendChild'd
        tb.push(html);
        tb.push(table);
        tb.setFosterInserts(true);

        Element fostered = elem("span");
        // ใช้ insertNode ผ่าน insert(Element) ซึ่งจะเรียก push ด้วย -> แต่เราสนใจแค่ parent ของ fostered
        tb.insert(fostered);

        assertSame(html, fostered.parent()); // aboveOnStack(table) == html
    }

    @Test
    public void testInsertElementConnectsFormListedControlToFormElement() {
        Element root = elem("html");
        tb.insert(root);
        FormElement form = new FormElement(Tag.valueOf("form"), BASE_URI, new Attributes());
        tb.insert(form);
        tb.setFormElement(form);

        Element input = elem("input"); // input.tag().isFormListed() == true
        tb.insert(input);

        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().first());
    }

    @Test
    public void testInsertElementFormListedWithoutFormElementNoException() {
        Element root = elem("html");
        tb.insert(root);
        Element input = elem("input"); // formElement == null -> skip addElement, ไม่ throw
        tb.insert(input);
        assertSame(root, input.parent());
    }

    // =====================================================================
    // stack manipulation methods
    // =====================================================================

    @Test
    public void testPushAndGetStack() {
        Element e = elem("html");
        tb.push(e);
        assertEquals(1, tb.getStack().size());
        assertSame(e, tb.getStack().get(0));
    }

    @Test
    public void testPopSingleElement() {
        Element e = elem("html");
        tb.push(e);
        assertSame(e, tb.pop());
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testOnStackTrueFalse() {
        Element a = elem("a");
        Element b = elem("b");
        tb.push(a);
        assertTrue(tb.onStack(a));
        assertFalse(tb.onStack(b));
    }

    @Test
    public void testGetFromStackFoundAndMiss() {
        Element div = elem("div");
        tb.push(elem("html"));
        tb.push(div);
        assertSame(div, tb.getFromStack("div"));
        assertNull(tb.getFromStack("span"));
    }

    @Test
    public void testRemoveFromStackFoundAndMiss() {
        Element div = elem("div");
        tb.push(elem("html"));
        tb.push(div);
        assertTrue(tb.removeFromStack(div));
        assertEquals(1, tb.getStack().size());
        assertFalse(tb.removeFromStack(div)); // ไม่มีแล้ว
    }

    @Test
    public void testPopStackToCloseSingleName_matchFound() {
        tb.push(elem("html"));
        tb.push(elem("div"));
        tb.push(elem("p"));
        tb.popStackToClose("div");
        assertEquals(1, tb.getStack().size()); // เหลือ html
    }

    @Test
    public void testPopStackToCloseSingleName_noMatchPopsAll() {
        tb.push(elem("div"));
        tb.push(elem("p"));
        tb.popStackToClose("span"); // ไม่พบ -> วนจนกระทั่ง stack หมด
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testPopStackToCloseVarargs() {
        tb.push(elem("html"));
        tb.push(elem("ol")); // sorted array ["li","p"]
        tb.push(elem("li"));
        tb.popStackToClose("li", "p");
        assertEquals(1, tb.getStack().size());
    }

    @Test
    public void testPopStackToBefore_found() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("tr"));
        tb.popStackToBefore("table");
        assertEquals(2, tb.getStack().size()); // html, table remain (tr removed)
    }

    @Test
    public void testPopStackToBefore_notFoundPopsAll() {
        tb.push(elem("div"));
        tb.push(elem("span"));
        tb.popStackToBefore("table");
        assertEquals(0, tb.getStack().size());
    }

    @Test
    public void testClearStackToTableContext_stopsAtMatch() {
        tb.push(elem("html"));
        tb.push(elem("div"));
        tb.push(elem("table"));
        tb.clearStackToTableContext();
        assertEquals(3, tb.getStack().size()); // table matched immediately, nothing removed
    }

    @Test
    public void testClearStackToTableContext_stopsAtHtmlWhenNoMatch() {
        tb.push(elem("html"));
        tb.push(elem("div"));
        tb.push(elem("span"));
        tb.clearStackToTableContext();
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testClearStackToTableBodyContext() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("tbody"));
        tb.clearStackToTableBodyContext();
        assertEquals(3, tb.getStack().size());
    }

    @Test
    public void testClearStackToTableRowContext() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("tbody"));
        tb.push(elem("tr"));
        tb.clearStackToTableRowContext();
        assertEquals(4, tb.getStack().size());
    }

    @Test
    public void testAboveOnStackNormal() {
        Element bottom = elem("html");
        Element top = elem("body");
        tb.push(bottom);
        tb.push(top);
        assertSame(bottom, tb.aboveOnStack(top));
    }

    @Test
    public void testAboveOnStackElementNotPresentReturnsNull() {
        tb.push(elem("html"));
        assertNull(tb.aboveOnStack(elem("div"))); // assert ถูก disable, loop จบโดยไม่เจอ -> null
    }

    // หมายเหตุ: นี่คือการพิสูจน์ fault จริง - เมื่อ element อยู่ล่างสุดของ stack (pos=0),
    // stack.get(pos-1) == stack.get(-1) จะ throw IndexOutOfBoundsException
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAboveOnStackBottomElementThrows() {
        Element bottom = elem("html");
        tb.push(bottom);
        tb.aboveOnStack(bottom);
    }

    @Test
    public void testInsertOnStackAfterSuccess() {
        Element a = elem("a");
        Element b = elem("b");
        Element c = elem("c");
        tb.push(a);
        tb.push(b);
        tb.insertOnStackAfter(a, c);
        assertEquals(Arrays.asList(a, c, b), tb.getStack());
    }

    @Test(expected = RuntimeException.class) // Validate.isTrue คาดว่า throw RuntimeException (IllegalArgumentException)
    public void testInsertOnStackAfterNotFoundThrows() {
        tb.push(elem("a"));
        tb.insertOnStackAfter(elem("notInStack"), elem("y"));
    }

    @Test
    public void testReplaceOnStackSuccess() {
        Element a = elem("a");
        Element b = elem("b");
        tb.push(a);
        tb.replaceOnStack(a, b);
        assertSame(b, tb.getStack().get(0));
    }

    @Test(expected = RuntimeException.class)
    public void testReplaceOnStackNotFoundThrows() {
        tb.push(elem("a"));
        tb.replaceOnStack(elem("notInStack"), elem("b"));
    }

    // =====================================================================
    // resetInsertionMode
    // =====================================================================

    @Test
    public void testResetInsertionMode_select() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("select"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testResetInsertionMode_td() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("tr"));
        tb.push(elem("td"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionMode_th_whenNotLast() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("tr"));
        tb.push(elem("th")); // top, last == false (pos != 0)
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    // หมายเหตุ: นี่คือการพิสูจน์ fault/quirk จากเงื่อนไข
    // `"td".equals(name) || "th".equals(name) && !last` (precedence ของ && สูงกว่า ||)
    // เมื่อ "th" อยู่ที่ pos==0 (last==true) เงื่อนไขนี้จะเป็น false เสมอ
    // ทำให้ตกไปที่ else-if(last) -> InBody แทนที่จะเป็น InCell
    @Test
    public void testResetInsertionMode_th_whenLast_fallsThroughToInBody() {
        tb.push(elem("html")); // stack มี 1 element เท่านั้น -> pos==0 -> last==true
        setContextElement(elem("th"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state()); // ไม่ใช่ InCell!
    }

    @Test
    public void testResetInsertionMode_td_whenLast_stillInCell() {
        // ยืนยันว่า "td" (ฝั่งซ้ายของ ||) ทำงานถูกแม้ last==true
        tb.push(elem("html"));
        setContextElement(elem("td"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionMode_tr() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("tr"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testResetInsertionMode_tbody() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("tbody"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_caption() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("caption"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testResetInsertionMode_colgroup() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("colgroup"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testResetInsertionMode_table() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testResetInsertionMode_head() {
        tb.push(elem("html"));
        tb.push(elem("head"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_body() {
        tb.push(elem("html"));
        tb.push(elem("body"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_frameset() {
        tb.push(elem("html"));
        tb.push(elem("frameset"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testResetInsertionMode_html_atBottomViaContext() {
        tb.push(elem("html")); // pos0,last=true -> node=contextElement
        setContextElement(elem("html"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testResetInsertionMode_fallbackElseIfLast() {
        tb.push(elem("html")); // pos0,last=true -> node=contextElement("div", ไม่ match อะไร)
        setContextElement(elem("div"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    // =====================================================================
    // inScope / inListItemScope / inButtonScope / inTableScope / inSelectScope / isSpecial
    // =====================================================================

    @Test
    public void testInScope_targetFoundBeforeBaseType() {
        tb.push(elem("html"));
        tb.push(elem("div"));
        assertTrue(tb.inScope("div"));
    }

    @Test
    public void testInScope_stopsAtBaseType() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("td"));
        assertFalse(tb.inScope("foo")); // "td" เป็น baseType -> false
    }

    @Test
    public void testInScope_arrayOverload() {
        tb.push(elem("html"));
        tb.push(elem("div"));
        assertTrue(tb.inScope(new String[]{"div", "span"}));
        assertFalse(tb.inScope(new String[]{"span", "section"}));
    }

    @Test(expected = RuntimeException.class) // Validate.fail
    public void testInScope_unreachableThrows() {
        tb.push(elem("div")); // ไม่มี baseType("html" ฯลฯ) และไม่มี target
        tb.inScope("span");
    }

    @Test
    public void testInListItemScope_extraTypeStopsSearch() {
        tb.push(elem("html"));
        tb.push(elem("ul")); // extraType ("ol"/"ul")
        tb.push(elem("div"));
        assertFalse(tb.inListItemScope("li")); // เจอ ul (extraType) ก่อนเจอ target -> false
    }

    @Test
    public void testInListItemScope_targetFoundFirst() {
        tb.push(elem("html"));
        tb.push(elem("ul"));
        tb.push(elem("li"));
        assertTrue(tb.inListItemScope("li"));
    }

    @Test
    public void testInButtonScope() {
        tb.push(elem("html"));
        tb.push(elem("button"));
        assertFalse(tb.inButtonScope("p")); // button เป็น extraType -> false
    }

    @Test
    public void testInTableScope_trueAndFalse() {
        tb.push(elem("html"));
        tb.push(elem("table"));
        tb.push(elem("tr"));
        assertTrue(tb.inTableScope("tr"));
        assertFalse(tb.inTableScope("section")); // stop ที่ table (baseType)
    }

    @Test
    public void testInSelectScope_trueViaContinueThenMatch() {
        tb.push(elem("html"));
        tb.push(elem("select"));
        tb.push(elem("option")); // option อยู่ใน allowed-set -> continue
        assertTrue(tb.inSelectScope("select"));
    }

    @Test
    public void testInSelectScope_falseWhenElementNotInAllowedSet() {
        tb.push(elem("html"));
        tb.push(elem("select"));
        tb.push(elem("div")); // div ไม่อยู่ใน TagSearchSelectScope -> return false ทันที
        assertFalse(tb.inSelectScope("select"));
    }

    @Test(expected = RuntimeException.class) // Validate.fail เมื่อวนจบโดยไม่เจอ/ไม่ return false
    public void testInSelectScope_unreachableThrows() {
        tb.push(elem("optgroup"));
        tb.push(elem("option"));
        tb.inSelectScope("select"); // ทั้งสอง element อยู่ใน allowed set ตลอด -> loop จบโดยไม่ return
    }

    @Test
    public void testIsSpecial() {
        assertTrue(tb.isSpecial(elem("div")));
        assertFalse(tb.isSpecial(elem("span")));
    }

    // =====================================================================
    // generateImpliedEndTags
    // =====================================================================

    // หมายเหตุ: ชี้ fault/quirk - เมื่อ excludeTag เป็น null (เรียกผ่าน generateImpliedEndTags())
    // เงื่อนไข `(excludeTag != null && ...) && inSorted(...)` จะเป็น false ตั้งแต่ short-circuit แรก
    // ทำให้ "ไม่ pop อะไรเลย" แม้ top element จะอยู่ใน TagSearchEndTags (เช่น "p")
    @Test
    public void testGenerateImpliedEndTags_noExclusion_popsNothing() {
        tb.push(elem("html"));
        tb.push(elem("p")); // "p" อยู่ใน TagSearchEndTags
        tb.generateImpliedEndTags();
        assertEquals(2, tb.getStack().size());
        assertEquals("p", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testGenerateImpliedEndTags_excludeDiffers_popsAllInList() {
        tb.push(elem("html"));
        tb.push(elem("p"));
        tb.push(elem("li"));
        tb.generateImpliedEndTags("div"); // div ไม่ match ทั้งคู่ -> pop p,li จนถึง html(ไม่อยู่ใน list)
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testGenerateImpliedEndTags_excludeMatchesCurrent_stopsImmediately() {
        tb.push(elem("html"));
        tb.push(elem("p"));
        tb.generateImpliedEndTags("p"); // current == excludeTag -> หยุดทันที
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testGenerateImpliedEndTags_currentNotInList_stopsImmediately() {
        tb.push(elem("html"));
        tb.push(elem("div")); // div ไม่อยู่ใน TagSearchEndTags
        tb.generateImpliedEndTags("p");
        assertEquals(2, tb.getStack().size());
    }

    // =====================================================================
    // Active formatting elements
    // =====================================================================

    @Test
    public void testLastFormattingElement_emptyReturnsNull() {
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testRemoveLastFormattingElement_emptyReturnsNull() {
        assertNull(tb.removeLastFormattingElement());
    }

    @Test
    public void testPushAndRemoveLastFormattingElement() {
        Element e1 = elem("b");
        tb.pushActiveFormattingElements(e1);
        assertSame(e1, tb.lastFormattingElement());
        assertSame(e1, tb.removeLastFormattingElement());
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testPushActiveFormattingElements_removesOldestAfterThreeMatches() {
        Element e1 = elem("b");
        Element e2 = elem("b");
        Element e3 = elem("b");
        Element e4 = elem("b"); // ทุกตัวมี tag+attributes เหมือนกัน (ว่าง)
        tb.pushActiveFormattingElements(e1);
        tb.pushActiveFormattingElements(e2);
        tb.pushActiveFormattingElements(e3);
        tb.pushActiveFormattingElements(e4); // numSeen ถึง 3 -> ลบตัวเก่าสุด (e1)

        assertFalse(tb.isInActiveFormattingElements(e1));
        assertTrue(tb.isInActiveFormattingElements(e2));
        assertTrue(tb.isInActiveFormattingElements(e3));
        assertTrue(tb.isInActiveFormattingElements(e4));
    }

    @Test
    public void testPushActiveFormattingElements_markerBlocksCounting() {
        Element e1 = elem("b");
        tb.pushActiveFormattingElements(e1);
        tb.insertMarkerToFormattingElements();
        Element e2 = elem("b");
        Element e3 = elem("b");
        Element e4 = elem("b");
        tb.pushActiveFormattingElements(e2);
        tb.pushActiveFormattingElements(e3);
        tb.pushActiveFormattingElements(e4); // นับได้แค่ e2,e3 ก่อนชน marker -> ไม่ลบ

        assertTrue(tb.isInActiveFormattingElements(e1));
        assertTrue(tb.isInActiveFormattingElements(e2));
        assertTrue(tb.isInActiveFormattingElements(e3));
        assertTrue(tb.isInActiveFormattingElements(e4));
    }

    @Test
    public void testClearFormattingElementsToLastMarker_stopsAtMarker() {
        Element e1 = elem("b");
        Element e2 = elem("i");
        tb.pushActiveFormattingElements(e1);
        tb.insertMarkerToFormattingElements();
        tb.pushActiveFormattingElements(e2);

        tb.clearFormattingElementsToLastMarker();
        assertTrue(tb.isInActiveFormattingElements(e1));
        assertFalse(tb.isInActiveFormattingElements(e2));
    }

    @Test
    public void testClearFormattingElementsToLastMarker_noMarkerClearsAll() {
        tb.pushActiveFormattingElements(elem("b"));
        tb.pushActiveFormattingElements(elem("i"));
        tb.clearFormattingElementsToLastMarker();
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testRemoveFromActiveFormattingElements_foundAndNotFound() {
        Element e1 = elem("b");
        Element e2 = elem("i");
        tb.pushActiveFormattingElements(e1);
        tb.removeFromActiveFormattingElements(e2); // ไม่พบ -> ไม่มีผล ไม่ throw
        assertTrue(tb.isInActiveFormattingElements(e1));
        tb.removeFromActiveFormattingElements(e1);
        assertFalse(tb.isInActiveFormattingElements(e1));
    }

    @Test
    public void testGetActiveFormattingElement_foundAndMarkerStop() {
        Element e1 = new Element(Tag.valueOf("b"), BASE_URI);
        tb.pushActiveFormattingElements(e1);
        assertSame(e1, tb.getActiveFormattingElement("b"));

        tb.insertMarkerToFormattingElements();
        // ตอนนี้ list = [e1(b), null] ; ค้นหา "b" จาก top -> เจอ null (marker) ก่อน -> null
        assertNull(tb.getActiveFormattingElement("b"));
    }

    @Test
    public void testGetActiveFormattingElement_notFoundNaturalExit() {
        tb.pushActiveFormattingElements(elem("i"));
        assertNull(tb.getActiveFormattingElement("b"));
    }

    @Test
    public void testReplaceActiveFormattingElement_success() {
        Element out = elem("b");
        Element in = elem("i");
        tb.pushActiveFormattingElements(out);
        tb.replaceActiveFormattingElement(out, in);
        assertSame(in, tb.lastFormattingElement());
    }

    @Test(expected = RuntimeException.class)
    public void testReplaceActiveFormattingElement_notFoundThrows() {
        tb.replaceActiveFormattingElement(elem("b"), elem("i"));
    }

    @Test
    public void testInsertMarkerToFormattingElements() {
        tb.insertMarkerToFormattingElements();
        assertNull(tb.lastFormattingElement()); // marker (null) ถูกเพิ่มเข้าไป
    }

    // =====================================================================
    // reconstructFormattingElements
    // =====================================================================

    @Test
    public void testReconstruct_lastIsNull_returnsImmediately() {
        tb.push(elem("html"));
        tb.reconstructFormattingElements(); // formattingElements ว่าง -> ไม่มีอะไรเกิดขึ้น ไม่ throw
        assertEquals(1, tb.getStack().size());
    }

    @Test
    public void testReconstruct_lastOnStack_returnsImmediately() {
        Element root = elem("html");
        tb.push(root);
        Element b = elem("b");
        tb.push(b); // b อยู่บน stack แล้ว
        tb.pushActiveFormattingElements(b);

        tb.reconstructFormattingElements();
        assertEquals(2, tb.getStack().size()); // ไม่มีการสร้าง element ใหม่
    }

    @Test
    public void testReconstruct_singleEntryNotOnStack_recreatesElement() {
        Element root = elem("html");
        tb.insert(root); // ต้อง insert (ไม่ใช่แค่ push) เพื่อให้ insertStartTag ภายในทำงานได้ถูกต้อง
        Element bEl = elem("b");
        bEl.attr("x", "1");
        tb.pushActiveFormattingElements(bEl); // ไม่ได้อยู่บน stack

        tb.reconstructFormattingElements();

        assertEquals(2, tb.getStack().size());
        Element top = tb.getStack().get(tb.getStack().size() - 1);
        assertEquals("b", top.nodeName());
        assertEquals("1", top.attr("x"));
        assertNotSame(bEl, tb.lastFormattingElement()); // entry ถูกแทนที่ด้วย newEl
    }

    @Test
    public void testReconstruct_multipleEntriesAfterLastOnStack() {
        Element root = elem("html");
        tb.insert(root);

        Element onStackFmt = elem("u");
        tb.insert(onStackFmt); // อยู่ทั้งใน stack และ formattingElements
        tb.pushActiveFormattingElements(onStackFmt);

        Element fA = elem("b");
        Element fB = elem("i");
        tb.pushActiveFormattingElements(fA);
        tb.pushActiveFormattingElements(fB); // ทั้งคู่ไม่อยู่บน stack

        tb.reconstructFormattingElements();

        // คาดว่า stack เพิ่ม 2 element ใหม่ (สำหรับ fA, fB) ต่อจาก onStackFmt
        assertEquals(4, tb.getStack().size()); // html, onStackFmt, newB, newI
        assertEquals("b", tb.getStack().get(2).nodeName());
        assertEquals("i", tb.getStack().get(3).nodeName());
    }

    // =====================================================================
    // insertInFosterParent (ทดสอบตรง ๆ เพิ่มเติมจาก insert(Element) ด้านบน)
    // =====================================================================

    @Test
    public void testInsertInFosterParent_noTableInStack() {
        Element root = elem("html");
        tb.push(root); // ไม่มี table -> frag case
        TextNode t = new TextNode("x");
        tb.insertInFosterParent(t);
        assertSame(root, t.parent());
    }

    @Test
    public void testInsertInFosterParent_tableHasDomParent() {
        Element root = elem("html");
        Element table = elem("table");
        root.appendChild(table); // DOM parent ของ table คือ root
        tb.push(root);
        tb.push(table); // ให้ getFromStack("table") หาเจอ

        TextNode t = new TextNode("x");
        tb.insertInFosterParent(t);

        assertSame(root, t.parent());
        assertTrue(root.childNodes().indexOf(t) < root.childNodes().indexOf(table));
    }

    // =====================================================================
    // Integration tests (ผ่าน public API) สำหรับ path ที่ต้องใช้ Token
    // (insert(Token.StartTag), insertEmpty, insertForm, insert(Comment), insert(Character), process)
    // =====================================================================

    @Test
    public void testIntegration_selfClosingNonVoidTagEmptiesElement() {
        Document doc = Jsoup.parse("<div/>after", BASE_URI);
        Element div = doc.select("div").first();
        assertNotNull(div);
        assertEquals(0, div.childNodeSize()); // self-closing -> ไม่มี child
    }

    @Test
    public void testIntegration_normalStartEndTag() {
        Document doc = Jsoup.parse("<div>hello</div>", BASE_URI);
        assertEquals("hello", doc.select("div").first().text());
    }

    @Test
    public void testIntegration_voidTagNoSelfClosingError() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<img src=\"x.png\">", BASE_URI);
        assertEquals(0, parser.getErrors().size());
    }

    @Test
    public void testIntegration_selfClosingKnownNonVoidTagGeneratesError() {
        Parser parser = Parser.htmlParser().setTrackErrors(10);
        parser.parseInput("<div/>", BASE_URI);
        assertTrue(parser.getErrors().size() > 0);
    }

    @Test
    public void testIntegration_commentInserted() {
        Document doc = Jsoup.parse("<!-- hello world -->", BASE_URI);
        assertTrue(doc.toString().contains("hello world"));
    }

    @Test
    public void testIntegration_characterInScriptBecomesDataNode() {
        Document doc = Jsoup.parse("<script>var x = 1;</script>", BASE_URI);
        Element script = doc.select("script").first();
        assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void testIntegration_characterInStyleBecomesDataNode() {
        Document doc = Jsoup.parse("<style>body{color:red}</style>", BASE_URI);
        Element style = doc.select("style").first();
        assertTrue(style.childNode(0) instanceof DataNode);
    }

    @Test
    public void testIntegration_characterInPBecomesTextNode() {
        Document doc = Jsoup.parse("<p>hello</p>", BASE_URI);
        Element p = doc.select("p").first();
        assertTrue(p.childNode(0) instanceof TextNode);
    }

    @Test
    public void testIntegration_insertFormConnectsListedControl() {
        Document doc = Jsoup.parse("<form id=f1><input name=i1></form>", BASE_URI);
        Element form = doc.select("form").first();
        assertTrue(form instanceof FormElement);
        assertEquals(1, ((FormElement) form).elements().size());
    }

    @Test
    public void testIntegration_insertNodeIntoEmptyStackGoesToDoc() {
        Document doc = Jsoup.parse("<!DOCTYPE html><html><body>x</body></html>", BASE_URI);
        assertTrue(doc.childNode(0) instanceof DocumentType);
    }

    @Test
    public void testIntegration_fosterParentingMisplacedTableText() {
        Document doc = Jsoup.parse("<table>foo<tr><td>bar</td></tr></table>", BASE_URI);
        String html = doc.body().html();
        assertTrue(html.indexOf("foo") < html.indexOf("<table"));
    }

    @Test
    public void testIntegration_nullOrEmptyInputDoesNotThrow() {
        // boundary case: empty input string
        Document doc = Jsoup.parse("", BASE_URI);
        assertNotNull(doc);
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testDefaultSettings`, `testInitialiseParseResetsState` | ค่าเริ่มต้นหลัง reset ทุก field |
| `testParseFragment*` (8 เมธอด) | if(context!=null)/else, ทุกสาขา if-else ของ contextTag (title/textarea, iframe/noembed/..., script, noscript, plaintext, else), quirksMode branch, form-ancestor found/not-found |
| `testTransitionStateMarkOriginal`, `testFramesetOk*`, `testFosterInserts*`, `testHeadElement*`, `testFormElement*`, `testPendingTableCharacters`, `testGetDocumentAndBaseUri`, `testIsFragmentParsingDefaultFalse`, `testToString*` | getter/setter ทุกตัว, สถานะก่อน/หลัง |
| `testMaybeSetBaseUri*` (2) | if(baseUriSetFromDoc) true/false, href.length()==0/!=0 |
| `testError*` (2) | if(errors.canAddError()) true/false |
| `testInsertElement*` (7) | insertNode: stack.size()==0, isFosterInserts() true/false, formListed+formElement null/not-null |
| `testPush/Pop/OnStack/GetFromStack/RemoveFromStack` | loop match/no-match ทุกเมธอด |
| `testPopStackToClose*`, `testPopStackToBefore*`, `testClearStackToTable*` | match-break, no-match-pop-all, html-stop branch |
| `testAboveOnStack*` (3) | normal, not-found→null, **bottom-element → IndexOutOfBoundsException (fault)** |
| `testInsertOnStackAfter*`, `testReplaceOnStack*`, `testReplaceActiveFormattingElement*` | Validate.isTrue success/throw |
| `testResetInsertionMode_*` (14) | ทุก else-if branch รวม **th/td precedence quirk (fault)** และ fallback else-if(last) |
| `testInScope*`, `testInListItemScope*`, `testInButtonScope`, `testInTableScope*`, `testInSelectScope*`, `testIsSpecial` | target-match, baseType-stop, extraType-stop, Validate.fail (unreachable) |
| `testGenerateImpliedEndTags_*` (4) | ทุก combination ของเงื่อนไข while รวม **null-exclude quirk (fault)** |
| `testLastFormattingElement*`, `testPushActiveFormattingElements*`, `testClearFormattingElementsToLastMarker*`, `testRemoveFromActiveFormattingElements*`, `testGetActiveFormattingElement*`, `testInsertMarkerToFormattingElements` | marker-break, numSeen==3 remove, found/not-found |
| `testReconstruct_*` (4) | last==null, last onStack, single-entry (pos==0 skip), multi-entry loop (continue vs break) |
| `testInsertInFosterParent_*` (2) | lastTable null, lastTable.parent()!=null/ null (aboveOnStack) |
| `testIntegration_*` (12) | process()/insert(StartTag,Comment,Character)/insertEmpty/insertForm ผ่าน public API (self-closing, void tag, error, foster text, doctype) |

**ข้อควรระวัง:** การทดสอบที่ใช้ reflection (`setContextElement`, `setCurrentToken`) และ integration ผ่าน `Jsoup.parse`/`Parser` เป็น best-effort เนื่องจากซอร์สของ `TreeBuilder`, `Token`, และ `HtmlTreeBuilderState` ไม่ได้ให้มาโดยตรง จึงไม่สามารถยืนยัน 100% ได้ว่าตรงกับ implementation จริงทุกเวอร์ชัน — ได้กำกับ assumption ไว้ในคอมเมนต์ทุกจุดตามที่กำหนด