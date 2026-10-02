# HtmlTreeBuilderTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- คลาสทดสอบอยู่ใน package `org.jsoup.parser` เดียวกับคลาสเป้าหมาย เนื่องจาก constructor และหลาย method ของ `HtmlTreeBuilder` เป็น package-private
- ใช้ reflection เข้าถึง field `contextElement` (private) เพื่อทดสอบ `resetInsertionMode()` แบบ deterministic — เป็นชื่อ field ที่ปรากฏตรงในซอร์สที่ให้มา ไม่ได้เดา behavior เพิ่ม
- จุดที่ไม่มีซอร์สของ dependency ให้ดู (เช่น `Validate.fail()`, `ParseErrorList`, `Tag` caching, `FormElement#elements()`) จะมีคอมเมนต์กำกับว่าเป็น "assumption" ตาม public API ที่เป็นมาตรฐานของ jsoup

```java
package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HtmlTreeBuilderTest {

    // ---------- helpers ----------

    private static final String BASE = "http://example.com/";

    private Element el(String tag) {
        return new Element(Tag.valueOf(tag), BASE);
    }

    /** สร้าง builder แล้วรัน parse() เบื้องต้นเพื่อ initialize fields ภายใน (doc, stack, baseUri, tokeniser) */
    private HtmlTreeBuilder newInitializedBuilder() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("<html><head></head><body></body></html>", BASE, ParseErrorList.noTracking());
        return tb;
    }

    /** ใช้ reflection set private field contextElement (ชื่อ field ตรงกับซอร์สที่ให้มา) */
    private void setContextElement(HtmlTreeBuilder tb, Element context) {
        try {
            Field f = HtmlTreeBuilder.class.getDeclaredField("contextElement");
            f.setAccessible(true);
            f.set(tb, context);
        } catch (Exception e) {
            fail("reflection failed: " + e.getMessage());
        }
    }

    // ================= parse / parseFragment =================

    @Test
    public void testParseBasicDocument() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<html><head><title>T</title></head><body><p>Hi</p></body></html>",
                BASE, ParseErrorList.noTracking());
        assertNotNull(doc);
        assertEquals("T", doc.title());
        assertEquals("Hi", doc.select("p").text());
    }

    @Test
    public void testParseFragmentNullContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("<p>Hello</p>", null, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes);
        assertTrue(tb.isFragmentParsing());
    }

    @Test
    public void testParseFragmentWithTitleContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("title");
        List<Node> nodes = tb.parseFragment("Some Text", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithScriptContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("script");
        List<Node> nodes = tb.parseFragment("var x = 1;", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithNoscriptContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("noscript");
        List<Node> nodes = tb.parseFragment("<p>hi</p>", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithIframeContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("iframe");
        List<Node> nodes = tb.parseFragment("raw text", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithPlaintextContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("plaintext");
        List<Node> nodes = tb.parseFragment("<p>raw</p>", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes);
    }

    @Test
    public void testParseFragmentWithDefaultElseContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("div"); // ไม่ match เงื่อนไขใด ๆ -> ตกไปที่ else สุดท้าย (Data)
        List<Node> nodes = tb.parseFragment("<p>Hi</p>", context, BASE, ParseErrorList.noTracking());
        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void testParseFragmentFormAncestorAssociatesFormElement() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        FormElement form = new FormElement(Tag.valueOf("form"), BASE, new Attributes());
        Element div = el("div");
        form.appendChild(div); // div.parents() จะพบ form เป็น ancestor
        tb.parseFragment("<input name='x'>", div, BASE, ParseErrorList.noTracking());
        assertSame(form, tb.getFormElement());
    }

    // ================= insert / insertStartTag / insertEmpty =================

    @Test
    public void testInsertStartTagAddsElementAndStack() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        int before = tb.getStack().size();
        Element elNode = tb.insertStartTag("div");
        assertEquals("div", elNode.tagName());
        assertEquals(before + 1, tb.getStack().size());
    }

    @Test
    public void testInsertElementDirect() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element e = el("span");
        int before = tb.getStack().size();
        tb.insert(e);
        assertEquals(before + 1, tb.getStack().size());
        assertSame(e, tb.getStack().get(tb.getStack().size() - 1));
    }

    @Test
    public void testInsertEmptyKnownSelfClosingTagNoParseError() {
        // "br" เป็น known void element -> isKnownTag()==true && isSelfClosing()==true -> acknowledgeSelfClosingFlag()
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        ParseErrorList errors = ParseErrorList.tracking(10); // assumption: ParseErrorList.tracking(n) มาตรฐานของ jsoup
        Document doc = tb.parse("<br/>", BASE, errors);
        Element br = doc.select("br").first();
        assertNotNull(br);
        // การ ack flag ควรทำให้ไม่เกิด parse error จากแฟล็ก self-closing ที่ไม่ได้รับการยืนยัน
        assertTrue(errors.isEmpty());
    }

    @Test
    public void testInsertEmptyUnknownSelfClosingTagMarksTagSelfClosing() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("<foobarxyz123/>", BASE, ParseErrorList.noTracking());
        // assumption: Tag.valueOf มี cache ภายใน -> tag.setSelfClosing() mutate instance ที่ cache ไว้
        assertTrue(Tag.valueOf("foobarxyz123").isSelfClosing());
    }

    @Test
    public void testInsertFormAssociatesFormListedControls() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parse("<form><input name='a'></form>", BASE, ParseErrorList.noTracking());
        FormElement form = tb.getFormElement();
        assertNotNull(form);
        assertEquals(1, form.elements().size()); // assumption: FormElement#elements() ตาม public API ของ jsoup
    }

    @Test
    public void testInsertCommentNode() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<!-- hello world -->", BASE, ParseErrorList.noTracking());
        assertTrue(doc.toString().contains("hello world"));
    }

    @Test
    public void testInsertCharacterScriptUsesDataNode() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<script>var x = 1;</script>", BASE, ParseErrorList.noTracking());
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void testInsertCharacterStyleUsesDataNode() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<style>body{color:red;}</style>", BASE, ParseErrorList.noTracking());
        Element style = doc.select("style").first();
        assertNotNull(style);
        assertTrue(style.childNode(0) instanceof DataNode);
    }

    @Test
    public void testInsertCharacterOtherTagUsesTextNode() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Document doc = tb.parse("<p>Hello</p>", BASE, ParseErrorList.noTracking());
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertTrue(p.childNode(0) instanceof TextNode);
    }

    // ================= stack helpers =================

    @Test
    public void testPopPush() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element e = el("div");
        tb.push(e);
        assertSame(e, tb.getStack().get(tb.getStack().size() - 1));
        Element popped = tb.pop();
        assertSame(e, popped);
    }

    @Test
    public void testOnStackTrueAndFalse() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element inStack = el("div");
        Element notInStack = el("span");
        tb.push(inStack);
        assertTrue(tb.onStack(inStack));
        assertFalse(tb.onStack(notInStack));
    }

    @Test
    public void testGetFromStackFoundAndNotFound() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        Element table = el("table");
        tb.push(table);
        assertSame(table, tb.getFromStack("table"));
        assertNull(tb.getFromStack("select"));
    }

    @Test
    public void testRemoveFromStackTrueFalse() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        Element d = el("div");
        tb.push(d);
        assertTrue(tb.removeFromStack(d));
        assertFalse(tb.onStack(d));
        assertFalse(tb.removeFromStack(d)); // ลบซ้ำ -> ไม่พบแล้ว
    }

    @Test
    public void testPopStackToCloseSingleName() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("body"));
        tb.push(el("div"));
        tb.popStackToClose("div");
        assertEquals(2, tb.getStack().size());
        assertEquals("body", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testPopStackToCloseVarargs() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("tbody"));
        tb.popStackToClose("tbody", "thead", "tfoot");
        assertEquals(2, tb.getStack().size());
        assertEquals("table", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testPopStackToBefore() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("tbody"));
        tb.push(el("tr"));
        tb.popStackToBefore("table");
        assertEquals(2, tb.getStack().size());
        assertEquals("table", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testClearStackToTableContext() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("div"));
        tb.clearStackToTableContext();
        assertEquals(2, tb.getStack().size());
        assertEquals("table", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testClearStackToTableBodyContext() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("tbody"));
        tb.push(el("span"));
        tb.clearStackToTableBodyContext();
        assertEquals(2, tb.getStack().size());
        assertEquals("tbody", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testClearStackToTableRowContext() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("tr"));
        tb.push(el("b"));
        tb.clearStackToTableRowContext();
        assertEquals(2, tb.getStack().size());
        assertEquals("tr", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testAboveOnStack() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        Element html = el("html");
        Element body = el("body");
        tb.push(html);
        tb.push(body);
        assertSame(html, tb.aboveOnStack(body));
    }

    @Test
    public void testInsertOnStackAfter() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        Element html = el("html");
        Element body = el("body");
        tb.push(html);
        tb.push(body);
        Element newEl = el("div");
        tb.insertOnStackAfter(html, newEl);
        assertEquals(3, tb.getStack().size());
        assertSame(newEl, tb.getStack().get(1));
    }

    @Test
    public void testReplaceOnStack() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        Element old = el("div");
        tb.push(old);
        Element replacement = el("span");
        tb.replaceOnStack(old, replacement);
        assertSame(replacement, tb.getStack().get(tb.getStack().size() - 1));
        assertFalse(tb.onStack(old));
    }

    // ================= resetInsertionMode =================

    private void assertResetMode(String contextTag, HtmlTreeBuilderState expected) {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        Element context = el(contextTag);
        setContextElement(tb, context);
        tb.push(context); // single element -> pos==0 -> last=true -> node ถูกแทนที่ด้วย contextElement อยู่ดี
        tb.resetInsertionMode();
        assertEquals(expected, tb.state());
    }

    @Test public void testResetInsertionModeSelect()   { assertResetMode("select",   HtmlTreeBuilderState.InSelect); }
    @Test public void testResetInsertionModeTd()        { assertResetMode("td",       HtmlTreeBuilderState.InCell); }
    @Test public void testResetInsertionModeTr()        { assertResetMode("tr",       HtmlTreeBuilderState.InRow); }
    @Test public void testResetInsertionModeTbody()     { assertResetMode("tbody",    HtmlTreeBuilderState.InTableBody); }
    @Test public void testResetInsertionModeCaption()   { assertResetMode("caption",  HtmlTreeBuilderState.InCaption); }
    @Test public void testResetInsertionModeColgroup()  { assertResetMode("colgroup", HtmlTreeBuilderState.InColumnGroup); }
    @Test public void testResetInsertionModeTable()     { assertResetMode("table",    HtmlTreeBuilderState.InTable); }
    @Test public void testResetInsertionModeHead()      { assertResetMode("head",     HtmlTreeBuilderState.InBody); }
    @Test public void testResetInsertionModeBody()      { assertResetMode("body",     HtmlTreeBuilderState.InBody); }
    @Test public void testResetInsertionModeFrameset()  { assertResetMode("frameset", HtmlTreeBuilderState.InFrameset); }
    @Test public void testResetInsertionModeHtml()      { assertResetMode("html",     HtmlTreeBuilderState.BeforeHead); }
    @Test public void testResetInsertionModeElseBranch(){ assertResetMode("div",      HtmlTreeBuilderState.InBody); }

    // ================= scope checks =================

    @Test
    public void testInScopeTrue() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("div"));
        tb.push(el("p"));
        assertTrue(tb.inScope("p"));
    }

    @Test
    public void testInScopeFalseHitsBaseType() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("table")); // "table" คือ base type ใน TagsSearchInScope
        assertFalse(tb.inScope("p"));
    }

    @Test(expected = RuntimeException.class)
    // assumption: Validate.fail() throw RuntimeException (เช่น IllegalArgumentException) ไม่มีซอร์ส Validate ให้ดู
    public void testInScopeThrowsWhenStackEmpty() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.inScope("p");
    }

    @Test
    public void testInListItemScopeTrue() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("ol"));
        tb.push(el("li"));
        assertTrue(tb.inListItemScope("li"));
    }

    @Test
    public void testInListItemScopeExtraTypeBlocksScope() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("ul")); // "ul" อยู่ใน extraTypes (TagSearchList) -> คืน false ก่อนถึง target
        assertFalse(tb.inListItemScope("li"));
    }

    @Test
    public void testInButtonScope() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("button"));
        assertFalse(tb.inButtonScope("p"));
    }

    @Test
    public void testInTableScopeTrueFalse() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("table"));
        tb.push(el("tr"));
        assertTrue(tb.inTableScope("table"));

        tb.getStack().clear();
        tb.push(el("html"));
        assertFalse(tb.inTableScope("table"));
    }

    @Test
    public void testInSelectScopeTrue() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("select"));
        tb.push(el("option"));
        assertTrue(tb.inSelectScope("select"));
    }

    @Test
    public void testInSelectScopeFalse() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("div")); // ไม่อยู่ใน TagSearchSelectScope -> คืน false ทันที
        assertFalse(tb.inSelectScope("select"));
    }

    // ================= simple getters / setters =================

    @Test
    public void testHeadElementGetSet() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        assertNull(tb.getHeadElement());
        Element head = el("head");
        tb.setHeadElement(head);
        assertSame(head, tb.getHeadElement());
    }

    @Test
    public void testFosterInsertsGetSet() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        assertFalse(tb.isFosterInserts());
        tb.setFosterInserts(true);
        assertTrue(tb.isFosterInserts());
    }

    @Test
    public void testFormElementGetSet() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        assertNull(tb.getFormElement());
        FormElement form = new FormElement(Tag.valueOf("form"), BASE, new Attributes());
        tb.setFormElement(form);
        assertSame(form, tb.getFormElement());
    }

    @Test
    public void testPendingTableCharacters() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        assertNotNull(tb.getPendingTableCharacters());
        assertTrue(tb.getPendingTableCharacters().isEmpty());

        List<String> list = new ArrayList<String>();
        list.add("abc");
        tb.setPendingTableCharacters(list);
        assertEquals(1, tb.getPendingTableCharacters().size());

        tb.newPendingTableCharacters();
        assertTrue(tb.getPendingTableCharacters().isEmpty());
    }

    @Test
    public void testFramesetOkGetSet() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        assertTrue(tb.framesetOk()); // default true
        tb.framesetOk(false);
        assertFalse(tb.framesetOk());
    }

    @Test
    public void testIsFragmentParsingDefaultFalse() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        assertFalse(tb.isFragmentParsing());
    }

    @Test
    public void testStateTransitionMarkOriginal() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        tb.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.originalState());
        tb.transition(HtmlTreeBuilderState.InTable);
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
        assertEquals(HtmlTreeBuilderState.InBody, tb.originalState());
    }

    @Test
    public void testGetDocumentAndBaseUri() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        assertNotNull(tb.getDocument());
        assertEquals(BASE, tb.getBaseUri());
    }

    @Test
    public void testToStringDoesNotThrow() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        String s = tb.toString();
        assertNotNull(s);
        assertTrue(s.startsWith("TreeBuilder{"));
    }

    // ================= generateImpliedEndTags =================

    @Test
    public void testGenerateImpliedEndTagsNoExclude() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("p"));
        tb.push(el("li"));
        tb.generateImpliedEndTags();
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testGenerateImpliedEndTagsWithExclude() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("p"));
        tb.generateImpliedEndTags("p"); // exclude -> ไม่ pop
        assertEquals(2, tb.getStack().size());
        assertEquals("p", tb.getStack().get(tb.getStack().size() - 1).nodeName());
    }

    @Test
    public void testGenerateImpliedEndTagsStopsAtNonMatchingTag() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        tb.push(el("div")); // ไม่อยู่ใน TagSearchEndTags -> loop ไม่ทำงาน
        tb.generateImpliedEndTags();
        assertEquals(2, tb.getStack().size());
    }

    // ================= isSpecial =================

    @Test
    public void testIsSpecialTrue() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        assertTrue(tb.isSpecial(el("div")));
    }

    @Test
    public void testIsSpecialFalse() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        assertFalse(tb.isSpecial(el("span"))); // "span" ไม่อยู่ใน TagSearchSpecial
    }

    // ================= active formatting elements =================

    @Test
    public void testLastFormattingElementEmpty() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testPushAndLastFormattingElement() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element b = el("b");
        tb.pushActiveFormattingElements(b);
        assertSame(b, tb.lastFormattingElement());
    }

    @Test
    public void testRemoveLastFormattingElementEmpty() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        assertNull(tb.removeLastFormattingElement());
    }

    @Test
    public void testRemoveLastFormattingElementNonEmpty() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element b = el("b");
        tb.pushActiveFormattingElements(b);
        assertSame(b, tb.removeLastFormattingElement());
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testPushActiveFormattingElementsNoahsArkClause() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element b1 = el("b");
        Element b2 = el("b");
        Element b3 = el("b");
        Element b4 = el("b");
        tb.pushActiveFormattingElements(b1);
        tb.pushActiveFormattingElements(b2);
        tb.pushActiveFormattingElements(b3);
        tb.pushActiveFormattingElements(b4); // numSeen==3 -> ลบตัวเก่าสุดที่ match ออก 1 ตัว
        assertFalse(tb.isInActiveFormattingElements(b1));
        assertTrue(tb.isInActiveFormattingElements(b4));
    }

    @Test
    public void testReconstructFormattingElementsNoLastElementNoop() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        int before = tb.getStack().size();
        tb.reconstructFormattingElements(); // list ว่าง -> return ทันที
        assertEquals(before, tb.getStack().size());
    }

    @Test
    public void testReconstructFormattingElementsLastOnStackNoop() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        Element b = el("b");
        tb.push(el("html"));
        tb.push(b);
        tb.pushActiveFormattingElements(b); // b อยู่บน stack ด้วย -> onStack(last)==true -> return ทันที
        int before = tb.getStack().size();
        tb.reconstructFormattingElements();
        assertEquals(before, tb.getStack().size());
    }

    @Test
    public void testReconstructFormattingElementsFullLogic() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        tb.push(el("html"));
        Element b = el("b"); // ไม่ push เข้า stack
        tb.pushActiveFormattingElements(b);
        int before = tb.getStack().size();
        tb.reconstructFormattingElements();
        assertEquals(before + 1, tb.getStack().size());
        Element newLast = tb.getStack().get(tb.getStack().size() - 1);
        assertEquals("b", newLast.tagName());
        assertNotSame(b, newLast);
        assertSame(newLast, tb.lastFormattingElement());
    }

    @Test
    public void testClearFormattingElementsToLastMarker() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element el1 = el("i");
        Element el2 = el("b");
        Element el3 = el("u");
        tb.pushActiveFormattingElements(el1);
        tb.insertMarkerToFormattingElements();
        tb.pushActiveFormattingElements(el2);
        tb.pushActiveFormattingElements(el3);
        tb.clearFormattingElementsToLastMarker();
        assertSame(el1, tb.lastFormattingElement());
    }

    @Test
    public void testRemoveFromActiveFormattingElements() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element b = el("b");
        tb.pushActiveFormattingElements(b);
        tb.removeFromActiveFormattingElements(b);
        assertFalse(tb.isInActiveFormattingElements(b));
    }

    @Test
    public void testIsInActiveFormattingElements() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element b = el("b");
        assertFalse(tb.isInActiveFormattingElements(b));
        tb.pushActiveFormattingElements(b);
        assertTrue(tb.isInActiveFormattingElements(b));
    }

    @Test
    public void testGetActiveFormattingElementFoundNotFoundAndMarkerStops() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element b = el("b");
        tb.pushActiveFormattingElements(b);
        assertSame(b, tb.getActiveFormattingElement("b"));
        assertNull(tb.getActiveFormattingElement("i"));

        tb.insertMarkerToFormattingElements();
        Element i = el("i");
        tb.pushActiveFormattingElements(i);
        // "b" อยู่ก่อน marker -> ต้องเจอ marker ก่อนแล้ว return null
        assertNull(tb.getActiveFormattingElement("b"));
    }

    @Test
    public void testReplaceActiveFormattingElement() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element b = el("b");
        tb.pushActiveFormattingElements(b);
        Element newB = el("b");
        tb.replaceActiveFormattingElement(b, newB);
        assertSame(newB, tb.getActiveFormattingElement("b"));
    }

    @Test
    public void testInsertMarkerToFormattingElements() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.insertMarkerToFormattingElements();
        assertNull(tb.lastFormattingElement()); // entry ล่าสุดคือ marker (null)
    }

    // ================= insertInFosterParent =================

    @Test
    public void testInsertInFosterParentWithTableHavingParent() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        Element body = el("body");
        Element table = el("table");
        body.appendChild(table); // table มี parent แล้ว
        tb.push(body);
        tb.push(table);
        Node newNode = new TextNode("inserted", BASE);
        tb.insertInFosterParent(newNode);
        assertEquals(2, body.childNodeSize());
        assertSame(newNode, body.childNode(0));
        assertSame(table, body.childNode(1));
    }

    @Test
    public void testInsertInFosterParentWithTableNoParent() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        Element body = el("body");
        Element table = el("table"); // ไม่มี parent จริง
        tb.push(body);
        tb.push(table);
        Node newNode = new TextNode("inserted", BASE);
        tb.insertInFosterParent(newNode);
        // fosterParent = aboveOnStack(table) = body -> appendChild
        assertEquals(1, body.childNodeSize());
        assertSame(newNode, body.childNode(0));
    }

    @Test
    public void testInsertInFosterParentNoTableOnStack() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        tb.getStack().clear();
        Element html = el("html");
        tb.push(html);
        Node newNode = new TextNode("inserted", BASE);
        tb.insertInFosterParent(newNode);
        // ไม่มี table -> fosterParent = stack.get(0) = html
        assertEquals(1, html.childNodeSize());
        assertSame(newNode, html.childNode(0));
    }

    // ================= maybeSetBaseUri =================

    @Test
    public void testMaybeSetBaseUriSetsOnFirstCallOnly() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        Element base1 = el("base");
        base1.attr("href", "http://example.com/newbase/");
        tb.maybeSetBaseUri(base1);
        assertEquals("http://example.com/newbase/", tb.getBaseUri());

        Element base2 = el("base");
        base2.attr("href", "http://example.com/ignored/");
        tb.maybeSetBaseUri(base2);
        // ครั้งที่สองต้องถูก ignore เพราะ baseUriSetFromDoc=true แล้ว
        assertEquals("http://example.com/newbase/", tb.getBaseUri());
    }

    @Test
    public void testMaybeSetBaseUriIgnoresEmptyHref() {
        HtmlTreeBuilder tb = newInitializedBuilder();
        String originalBaseUri = tb.getBaseUri();
        Element base = el("base"); // ไม่มี href -> absUrl("href") == ""
        tb.maybeSetBaseUri(base);
        assertEquals(originalBaseUri, tb.getBaseUri());
    }

    // ================= error tracking (indirect, ผ่าน public parse API) =================

    @Test
    public void testErrorsAreTrackedForMalformedInputWhenTrackingEnabled() {
        // assumption: ป้ายปิดที่ไม่ตรงกับป้ายเปิดจะกระตุ้น error() ใน tree builder อย่างน้อย 1 รายการ
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        ParseErrorList errors = ParseErrorList.tracking(10);
        tb.parse("<div></p></div>", BASE, errors);
        assertFalse(errors.isEmpty());
    }

    @Test
    public void testErrorsAreNotTrackedWhenNoTracking() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        ParseErrorList errors = ParseErrorList.noTracking(); // maxSize=0 -> canAddError() เป็น false เสมอ
        tb.parse("<div></p></div>", BASE, errors);
        assertTrue(errors.isEmpty());
    }
}
```

# สรุป Branch/Condition coverage

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testParseBasicDocument` | `parse()` เส้นทางปกติ (state=Initial, baseUriSetFromDoc=false) |
| `testParseFragment*` (null/title/script/noscript/iframe/plaintext/default/form-ancestor) | ทุกสาขา if/else-if ของ context tag ใน `parseFragment`, loop + `instanceof FormElement` ใน contextChain |
| `testInsertStartTagAddsElementAndStack`, `testInsertElementDirect` | `insertStartTag`, `insert(Element)` |
| `testInsertEmptyKnownSelfClosingTagNoParseError` | `insertEmpty`: `isKnownTag()==true && isSelfClosing()==true` |
| `testInsertEmptyUnknownSelfClosingTagMarksTagSelfClosing` | `insertEmpty`: unknown tag else-branch (`setSelfClosing`) |
| `testInsertFormAssociatesFormListedControls` | `insertForm(onStack=true)`, `insertNode` form-listed branch |
| `testInsertCommentNode` | `insert(Token.Comment)` |
| `testInsertCharacterScript/Style/Other` | `insert(Token.Character)` if/else (DataNode vs TextNode) |
| `testPopPush`…`testReplaceOnStack` | `pop/push/onStack/getFromStack/removeFromStack/popStackToClose(1)/popStackToClose(varargs)/popStackToBefore/clearStackToTable*/aboveOnStack/insertOnStackAfter/replaceOnStack` ทุก loop/break branch |
| `testResetInsertionMode*` (12 เมธอด) | ทุกสาขา if/else-if ของ `resetInsertionMode` |
| `testInScope*`, `testInListItemScope*`, `testInButtonScope`, `testInTableScope*`, `testInSelectScope*` | `inSpecificScope` true/false/Validate.fail, `inSelectScope` loop/early-return |
| `testHeadElement*`, `testFosterInserts*`, `testFormElement*`, `testPendingTableCharacters`, `testFramesetOk*`, `testIsFragmentParsing*`, `testStateTransition*`, `testGetDocumentAndBaseUri`, `testToString*` | getter/setter ตรง ๆ ของทุก field |
| `testGenerateImpliedEndTags*` (3 เมธอด) | while loop ของ `generateImpliedEndTags` ทั้ง exclude/no-exclude/ไม่เข้า loop |
| `testIsSpecialTrue/False` | `isSpecial` |
| `testLastFormattingElement*`, `testRemoveLastFormattingElement*`, `testPushActiveFormattingElementsNoahsArkClause` | `numSeen==3` branch, marker break |
| `testReconstructFormattingElements*` (3 เมธอด) | early-return (last null / onStack) และ full logic loop |
| `testClearFormattingElementsToLastMarker`, `testRemoveFromActiveFormattingElements`, `testIsInActiveFormattingElements`, `testGetActiveFormattingElement*`, `testReplaceActiveFormattingElement`, `testInsertMarkerToFormattingElements` | ทุก loop/break ของ active formatting element utilities |
| `testInsertInFosterParent*` (3 เมธอด) | `lastTable!=null && parent!=null` / `parent==null` / `lastTable==null` |
| `testMaybeSetBaseUri*` (2 เมธอด) | flag `baseUriSetFromDoc`, href ว่าง/ไม่ว่าง |
| `testErrorsAreTracked*` | `error()`: `errors.canAddError()` true/false (ผ่าน public parse API) |

**ข้อจำกัดที่ระบุไว้ชัดเจนด้วยคอมเมนต์ในโค้ด:** พฤติกรรมของ `Validate.fail()`, การ cache ของ `Tag.valueOf`, และ `ParseErrorList`/`FormElement#elements()` API ไม่มีซอร์สให้ตรวจสอบตรง ๆ จึงอิงจาก public API มาตรฐานของ jsoup พร้อมคอมเมนต์ assumption กำกับทุกจุด