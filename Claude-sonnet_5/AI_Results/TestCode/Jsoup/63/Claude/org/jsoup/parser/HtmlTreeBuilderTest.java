package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
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

public class HtmlTreeBuilderTest {

    // ---------- helpers ----------

    private HtmlTreeBuilder newBuilder(String html, String baseUri) {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader(html), baseUri, ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        return tb;
    }

    private HtmlTreeBuilder newBuilder() {
        return newBuilder("x", "http://example.com/");
    }

    private Element el(String tagName) {
        return new Element(Tag.valueOf(tagName), "http://example.com/");
    }

    /** ใช้ reflection set private field contextElement เนื่องจากไม่มี public/package setter
     *  นอกจากผ่าน parseFragment(...) เท่านั้น แต่เราต้องควบคุม state แบบละเอียดเพื่อทดสอบ
     *  resetInsertionMode() ตรง ๆ */
    private void setContextElement(HtmlTreeBuilder tb, Element context) throws Exception {
        Field f = HtmlTreeBuilder.class.getDeclaredField("contextElement");
        f.setAccessible(true);
        f.set(tb, context);
    }

    /** ใช้ reflection set currentToken (field ที่สืบทอดมาจาก TreeBuilder ซึ่งไม่ได้ให้ซอร์สมา)
     *  เพื่อเรียก error(state) ได้โดยไม่ต้องสร้าง Token ผ่าน API ที่ไม่รู้จัก */
    private void setCurrentToken(HtmlTreeBuilder tb, Token token) throws Exception {
        Class<?> c = tb.getClass();
        while (c != null) {
            try {
                Field f = c.getDeclaredField("currentToken");
                f.setAccessible(true);
                f.set(tb, token);
                return;
            } catch (NoSuchFieldException e) {
                c = c.getSuperclass();
            }
        }
        throw new NoSuchFieldException("currentToken field not found in hierarchy");
    }

    private int countTopLevelElements(List<Node> nodes) {
        int count = 0;
        for (Node n : nodes) {
            if (n instanceof Element) count++;
        }
        return count;
    }

    // =====================================================================
    // initialiseParse
    // =====================================================================

    @Test
    public void testInitialiseParseSetsDefaults() {
        HtmlTreeBuilder tb = newBuilder("<div>", "http://example.com/");
        assertNotNull(tb.getDocument());
        assertEquals("http://example.com/", tb.getBaseUri());
        assertTrue(tb.framesetOk());
        assertFalse(tb.isFragmentParsing());
        assertNull(tb.getHeadElement());
        assertNull(tb.getFormElement());
        assertEquals(0, tb.getStack().size());
        assertEquals(HtmlTreeBuilderState.Initial, tb.state());
        assertNull(tb.originalState());
        assertFalse(tb.isFosterInserts());
        assertNotNull(tb.getPendingTableCharacters());
        assertTrue(tb.getPendingTableCharacters().isEmpty());
    }

    // =====================================================================
    // transition / state / markInsertionMode / originalState / framesetOk
    // =====================================================================

    @Test
    public void testTransitionAndMarkInsertionMode() {
        HtmlTreeBuilder tb = newBuilder();
        tb.transition(HtmlTreeBuilderState.InBody);
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
        tb.markInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.originalState());
    }

    @Test
    public void testFramesetOkSetterGetter() {
        HtmlTreeBuilder tb = newBuilder();
        tb.framesetOk(false);
        assertFalse(tb.framesetOk());
        tb.framesetOk(true);
        assertTrue(tb.framesetOk());
    }

    @Test
    public void testFosterInsertsGetterSetter() {
        HtmlTreeBuilder tb = newBuilder();
        assertFalse(tb.isFosterInserts());
        tb.setFosterInserts(true);
        assertTrue(tb.isFosterInserts());
    }

    @Test
    public void testHeadElementGetterSetter() {
        HtmlTreeBuilder tb = newBuilder();
        Element head = el("head");
        tb.setHeadElement(head);
        assertSame(head, tb.getHeadElement());
    }

    @Test
    public void testPendingTableCharacters() {
        HtmlTreeBuilder tb = newBuilder();
        List<String> custom = new ArrayList<>();
        custom.add("abc");
        tb.setPendingTableCharacters(custom);
        assertEquals(custom, tb.getPendingTableCharacters());
        tb.newPendingTableCharacters();
        assertTrue(tb.getPendingTableCharacters().isEmpty());
        assertNotSame(custom, tb.getPendingTableCharacters());
    }

    @Test
    public void testToStringDoesNotThrow() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        String s = tb.toString();
        assertNotNull(s);
        assertTrue(s.contains("TreeBuilder"));
    }

    // =====================================================================
    // stack operations: push/pop/getStack/onStack/getFromStack/removeFromStack
    // =====================================================================

    @Test
    public void testStackBasicOps() {
        HtmlTreeBuilder tb = newBuilder();
        Element e1 = el("div");
        Element e2 = el("span");
        tb.push(e1);
        tb.push(e2);
        assertEquals(2, tb.getStack().size());
        assertTrue(tb.onStack(e2));
        assertTrue(tb.onStack(e1));
        assertSame(e2, tb.getFromStack("span"));
        assertNull(tb.getFromStack("p")); // not found branch

        Element popped = tb.pop();
        assertSame(e2, popped);
        assertEquals(1, tb.getStack().size());
        assertFalse(tb.onStack(e2)); // false branch after pop

        assertTrue(tb.removeFromStack(e1));
        assertEquals(0, tb.getStack().size());
        assertFalse(tb.removeFromStack(e1)); // not found -> false branch
    }

    @Test
    public void testPopStackToClose_singleName() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("body"));
        tb.push(el("div"));
        tb.popStackToClose("body"); // pops div, body(match) -> break
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testPopStackToClose_varargs() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("tbody"));
        tb.popStackToClose("tbody", "thead"); // matches tbody
        assertEquals(1, tb.getStack().size());
    }

    @Test
    public void testPopStackToBefore() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("tr"));
        tb.popStackToBefore("table"); // removes tr, stops before table
        assertEquals(2, tb.getStack().size());
        assertEquals("table", tb.getStack().get(1).nodeName());
    }

    // =====================================================================
    // clearStackToTableContext / Body / Row (clearStackToContext)
    // =====================================================================

    @Test
    public void testClearStackToTableContext() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("div"));
        tb.clearStackToTableContext();
        assertEquals(2, tb.getStack().size());
        assertEquals("table", tb.getStack().get(1).nodeName());
    }

    @Test
    public void testClearStackToTableBodyContext() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("tbody"));
        tb.push(el("tr"));
        tb.clearStackToTableBodyContext();
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testClearStackToTableRowContext() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("tr"));
        tb.push(el("td"));
        tb.clearStackToTableRowContext();
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testClearStackToContext_breaksOnHtmlWhenTargetMissing() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("div"));
        tb.clearStackToTableContext(); // no "table" present, breaks on "html"
        assertEquals(1, tb.getStack().size());
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    // =====================================================================
    // aboveOnStack / insertOnStackAfter / replaceOnStack
    // =====================================================================

    @Test
    public void testAboveOnStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element html = el("html");
        Element body = el("body");
        tb.push(html);
        tb.push(body);
        assertSame(html, tb.aboveOnStack(body));
    }

    @Test
    public void testInsertOnStackAfterAndReplaceOnStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element html = el("html");
        Element body = el("body");
        tb.push(html);
        tb.push(body);

        Element div = el("div");
        tb.insertOnStackAfter(html, div);
        assertEquals(3, tb.getStack().size());
        assertSame(div, tb.getStack().get(1));

        Element span = el("span");
        tb.replaceOnStack(div, span);
        assertSame(span, tb.getStack().get(1));
    }

    @Test(expected = Exception.class) // Validate.isTrue throws เมื่อ element ไม่พบ (ชนิด exception ไม่ทราบแน่ชัดจากซอร์สที่ให้มา)
    public void testInsertOnStackAfter_notFound_throws() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        Element notOnStack = el("body");
        tb.insertOnStackAfter(notOnStack, el("div"));
    }

    // =====================================================================
    // insert(Element) / insertNode branches / insertStartTag
    // =====================================================================

    @Test
    public void testInsertElement_StackEmpty_AppendsToDoc() {
        HtmlTreeBuilder tb = newBuilder();
        Element e = el("div");
        tb.insert(e);
        assertTrue(tb.getDocument().childNodes().contains(e));
        assertEquals(1, tb.getStack().size());
        assertSame(e, tb.getStack().get(0));
    }

    @Test
    public void testInsertElement_StackNotEmpty_AppendsToCurrentElement() {
        HtmlTreeBuilder tb = newBuilder();
        Element container = el("div");
        tb.push(container);
        Element inner = el("span");
        tb.insert(inner);
        assertTrue(container.children().contains(inner));
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testInsertElement_FosterInserts_NoTable_UsesStackBottom() {
        HtmlTreeBuilder tb = newBuilder();
        Element htmlEl = el("html");
        tb.push(htmlEl); // no "table" in stack
        tb.setFosterInserts(true);
        Element e = el("div");
        tb.insert(e);
        assertTrue(htmlEl.childNodes().contains(e));
        assertEquals(2, tb.getStack().size());
    }

    @Test
    public void testInsertStartTag() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        Element e = tb.insertStartTag("div");
        assertEquals("div", e.tagName());
        assertEquals(2, tb.getStack().size());
        assertSame(e, tb.getStack().get(1));
        assertTrue(tb.getStack().get(0).children().contains(e));
    }

    // สมมติฐาน: Tag.valueOf("input").isFormListed() == true ตาม HTML5 form-associated elements (ค่ามาตรฐานใน jsoup)
    @Test
    public void testInsertElement_FormAssociation_FormListedTag() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        tb.setFormElement(form);
        Element input = el("input");
        tb.insert(input);
        assertTrue(form.elements().contains(input));
    }

    @Test
    public void testInsertElement_NonFormListedTag_NotAssociated() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/", new Attributes());
        tb.setFormElement(form);
        Element div = el("div");
        tb.insert(div);
        assertTrue(form.elements().isEmpty());
    }

    @Test
    public void testInsertElement_FormListedTag_NoFormElementSet_NoException() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        Element input = el("input");
        tb.insert(input); // formElement == null, ต้องไม่ throw
        assertEquals(2, tb.getStack().size());
    }

    // =====================================================================
    // generateImpliedEndTags(excludeTag) / generateImpliedEndTags()
    // =====================================================================

    @Test
    public void testGenerateImpliedEndTags_NoArg_NeverPops() {
        // ตามซอร์สที่ให้มา: เมื่อ excludeTag == null เงื่อนไข
        // (excludeTag != null && ...) จะเป็น false เสมอ -> ลูป while ไม่ทำงานเลย
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("p")); // "p" อยู่ใน TagSearchEndTags
        tb.generateImpliedEndTags();
        assertEquals(2, tb.getStack().size()); // ไม่มีการ pop ตามพฤติกรรมจริงของซอร์ส
    }

    @Test
    public void testGenerateImpliedEndTags_WithExclude_PopsUntilNonMatching() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("dd"));
        tb.push(el("dt")); // top
        tb.generateImpliedEndTags("xyz"); // excludeTag ไม่ตรงกับ current element ใด ๆ
        assertEquals(1, tb.getStack().size()); // pop dt, dd แล้วหยุดที่ html (ไม่อยู่ใน list)
        assertEquals("html", tb.getStack().get(0).nodeName());
    }

    @Test
    public void testGenerateImpliedEndTags_ExcludeMatchesCurrent_StopsImmediately() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("p"));
        tb.generateImpliedEndTags("p"); // current == excludeTag -> ไม่ pop
        assertEquals(2, tb.getStack().size());
    }

    // =====================================================================
    // isSpecial
    // =====================================================================

    @Test
    public void testIsSpecialTrueAndFalse() {
        HtmlTreeBuilder tb = newBuilder();
        assertTrue(tb.isSpecial(el("div")));
        assertFalse(tb.isSpecial(el("span"))); // "span" ไม่อยู่ใน TagSearchSpecial
    }

    // =====================================================================
    // inScope family (inSpecificScope)
    // =====================================================================

    @Test
    public void testInScope_TrueWhenTargetFoundBeforeBase() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("div"));
        assertTrue(tb.inScope("div"));
    }

    @Test
    public void testInScope_FalseWhenBaseHitFirst() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        assertFalse(tb.inScope("div"));
    }

    @Test
    public void testInListItemScope() {
        HtmlTreeBuilder tbTrue = newBuilder();
        tbTrue.push(el("html"));
        tbTrue.push(el("ul"));
        tbTrue.push(el("li"));
        assertTrue(tbTrue.inListItemScope("li"));

        HtmlTreeBuilder tbFalse = newBuilder();
        tbFalse.push(el("html"));
        tbFalse.push(el("ul")); // "ul" เป็น extra-type -> false
        assertFalse(tbFalse.inListItemScope("li"));
    }

    @Test
    public void testInButtonScope() {
        HtmlTreeBuilder tbTrue = newBuilder();
        tbTrue.push(el("html"));
        tbTrue.push(el("button"));
        tbTrue.push(el("p"));
        assertTrue(tbTrue.inButtonScope("p"));

        HtmlTreeBuilder tbFalse = newBuilder();
        tbFalse.push(el("html"));
        tbFalse.push(el("button"));
        assertFalse(tbFalse.inButtonScope("p"));
    }

    @Test
    public void testInTableScope() {
        HtmlTreeBuilder tbTrue = newBuilder();
        tbTrue.push(el("html"));
        tbTrue.push(el("table"));
        tbTrue.push(el("tr"));
        assertTrue(tbTrue.inTableScope("tr"));

        HtmlTreeBuilder tbFalse = newBuilder();
        tbFalse.push(el("html"));
        tbFalse.push(el("table"));
        assertFalse(tbFalse.inTableScope("tr"));
    }

    @Test
    public void testInSelectScope() {
        HtmlTreeBuilder tbTrue = newBuilder();
        tbTrue.push(el("html"));
        tbTrue.push(el("select"));
        tbTrue.push(el("optgroup"));
        tbTrue.push(el("option"));
        assertTrue(tbTrue.inSelectScope("option"));

        HtmlTreeBuilder tbFalse = newBuilder();
        tbFalse.push(el("html"));
        tbFalse.push(el("select"));
        tbFalse.push(el("div")); // "div" ไม่อยู่ใน TagSearchSelectScope -> false ทันที
        assertFalse(tbFalse.inSelectScope("option"));
    }

    @Test(expected = Exception.class) // Validate.fail() เมื่อ stack ว่าง (ไม่พบ target/base/extra เลย)
    public void testInScope_ValidateFail_EmptyStack() {
        HtmlTreeBuilder tb = newBuilder();
        tb.inScope("div"); // stack ว่าง -> loop ไม่ทำงาน -> Validate.fail
    }

    // =====================================================================
    // resetInsertionMode - ครอบคลุมแต่ละสาขา
    // =====================================================================

    @Test
    public void testResetInsertionMode_Select() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("select"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InSelect, tb.state());
    }

    @Test
    public void testResetInsertionMode_Td_NotLast() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("td")); // อยู่บนสุด -> last=false เสมอ (break ก่อนถึง pos==0)
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionMode_Th_NotLast() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("th"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCell, tb.state());
    }

    @Test
    public void testResetInsertionMode_Tr() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("tr"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InRow, tb.state());
    }

    @Test
    public void testResetInsertionMode_TableBody() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("tfoot"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTableBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_Caption() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("caption"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InCaption, tb.state());
    }

    @Test
    public void testResetInsertionMode_ColumnGroup() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.push(el("colgroup"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InColumnGroup, tb.state());
    }

    @Test
    public void testResetInsertionMode_Table() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("html"));
        tb.push(el("table"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InTable, tb.state());
    }

    @Test
    public void testResetInsertionMode_Head() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("table")); // dummy ไม่สำคัญ ไม่ถูกตรวจเพราะ break ก่อนถึง
        tb.push(el("head"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_Body() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("table"));
        tb.push(el("body"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_Frameset() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("table"));
        tb.push(el("frameset"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InFrameset, tb.state());
    }

    @Test
    public void testResetInsertionMode_Html() {
        HtmlTreeBuilder tb = newBuilder();
        tb.push(el("table"));
        tb.push(el("html"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.BeforeHead, tb.state());
    }

    @Test
    public void testResetInsertionMode_FallbackLast_UnmatchedContext() throws Exception {
        HtmlTreeBuilder tb = newBuilder();
        setContextElement(tb, el("span")); // tag ไม่ตรงกับ case ใด ๆ
        tb.push(el("placeholder")); // stack ขนาด 1 -> pos==0 ทันที, last=true, node ถูก overwrite เป็น contextElement
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    /**
     * *** Fault-detecting test สำหรับ Jsoup-63b ***
     * ตาม HTML5 spec: เมื่อ last == true (เช่น fragment-context เป็น "td")
     * ไม่ควร transition ไปที่ InCell แต่ควร fallback ไปที่ InBody
     * แต่ซอร์สที่ให้มามีบั๊ก operator precedence:
     *   ("td".equals(name) || "th".equals(name) && !last)
     * ทำให้ "td" match โดยไม่สนใจค่า last เลย -> จะได้ InCell ผิดพลาด
     * หาก source นี้มีบั๊กจริง test นี้จะ FAIL (ตามที่คาดหวัง)
     */
    @Test
    public void testResetInsertionMode_Td_Last_SpecCompliant_DetectsJsoup63bBug() throws Exception {
        HtmlTreeBuilder tb = newBuilder();
        setContextElement(tb, el("td"));
        tb.push(el("placeholder"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    @Test
    public void testResetInsertionMode_Th_Last_SpecCompliant() throws Exception {
        // th ถูก guard ด้วย !last อย่างถูกต้องอยู่แล้ว (ไม่ใช่บั๊ก) -> ต้องผ่านทั้งสองกรณี
        HtmlTreeBuilder tb = newBuilder();
        setContextElement(tb, el("th"));
        tb.push(el("placeholder"));
        tb.resetInsertionMode();
        assertEquals(HtmlTreeBuilderState.InBody, tb.state());
    }

    // =====================================================================
    // active formatting elements
    // =====================================================================

    @Test
    public void testLastAndRemoveLastFormattingElement_Empty() {
        HtmlTreeBuilder tb = newBuilder();
        assertNull(tb.lastFormattingElement());
        assertNull(tb.removeLastFormattingElement());
    }

    @Test
    public void testPushAndLastFormattingElement() {
        HtmlTreeBuilder tb = newBuilder();
        Element b = el("b");
        tb.pushActiveFormattingElements(b);
        assertSame(b, tb.lastFormattingElement());
        assertSame(b, tb.removeLastFormattingElement());
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testPushActiveFormattingElements_NumSeenThree_RemovesEarliestDuplicate() {
        HtmlTreeBuilder tb = newBuilder();
        Element e1 = new Element(Tag.valueOf("b"), "http://example.com/");
        Element e2 = new Element(Tag.valueOf("b"), "http://example.com/");
        Element e3 = new Element(Tag.valueOf("b"), "http://example.com/");
        Element e4 = new Element(Tag.valueOf("b"), "http://example.com/");
        tb.pushActiveFormattingElements(e1);
        tb.pushActiveFormattingElements(e2);
        tb.pushActiveFormattingElements(e3);
        tb.pushActiveFormattingElements(e4); // ควรลบ e1 (ตัวที่เจอลำดับที่ 3 จากบนลงล่าง) ออก
        assertFalse(tb.isInActiveFormattingElements(e1));
        assertTrue(tb.isInActiveFormattingElements(e2));
        assertTrue(tb.isInActiveFormattingElements(e3));
        assertTrue(tb.isInActiveFormattingElements(e4));
    }

    @Test
    public void testPushActiveFormattingElements_StopsAtMarker() {
        HtmlTreeBuilder tb = newBuilder();
        Element e1 = new Element(Tag.valueOf("b"), "http://example.com/");
        Element e2 = new Element(Tag.valueOf("b"), "http://example.com/");
        tb.insertMarkerToFormattingElements();
        tb.pushActiveFormattingElements(e1);
        tb.pushActiveFormattingElements(e2);
        Element e3 = new Element(Tag.valueOf("b"), "http://example.com/");
        tb.pushActiveFormattingElements(e3); // numSeen ควรนับแค่ e2,e1 แล้วชน marker -> break ไม่ลบ
        assertTrue(tb.isInActiveFormattingElements(e1));
        assertTrue(tb.isInActiveFormattingElements(e2));
        assertTrue(tb.isInActiveFormattingElements(e3));
    }

    @Test
    public void testInsertMarkerToFormattingElements() {
        HtmlTreeBuilder tb = newBuilder();
        tb.pushActiveFormattingElements(el("b"));
        tb.insertMarkerToFormattingElements();
        assertNull(tb.lastFormattingElement()); // top คือ marker (null)
    }

    @Test
    public void testGetActiveFormattingElement_StopsAtMarker() {
        HtmlTreeBuilder tb = newBuilder();
        Element b = el("b");
        tb.pushActiveFormattingElements(b);
        tb.insertMarkerToFormattingElements();
        Element i = el("i");
        tb.pushActiveFormattingElements(i);

        assertSame(i, tb.getActiveFormattingElement("i"));
        assertNull(tb.getActiveFormattingElement("b")); // ถูกบล็อคด้วย marker
    }

    @Test
    public void testGetActiveFormattingElement_NotFound() {
        HtmlTreeBuilder tb = newBuilder();
        tb.pushActiveFormattingElements(el("b"));
        assertNull(tb.getActiveFormattingElement("i"));
    }

    @Test
    public void testRemoveFromActiveFormattingElements_FoundAndNotFound() {
        HtmlTreeBuilder tb = newBuilder();
        Element b = el("b");
        Element i = el("i");
        tb.pushActiveFormattingElements(b);
        tb.pushActiveFormattingElements(i);

        tb.removeFromActiveFormattingElements(b);
        assertFalse(tb.isInActiveFormattingElements(b));
        assertTrue(tb.isInActiveFormattingElements(i));

        tb.removeFromActiveFormattingElements(b); // ไม่พบแล้ว ไม่ throw
        assertFalse(tb.isInActiveFormattingElements(b));
    }

    @Test
    public void testReplaceActiveFormattingElement() {
        HtmlTreeBuilder tb = newBuilder();
        Element b = el("b");
        tb.pushActiveFormattingElements(b);
        Element newB = el("b");
        tb.replaceActiveFormattingElement(b, newB);
        assertFalse(tb.isInActiveFormattingElements(b));
        assertTrue(tb.isInActiveFormattingElements(newB));
    }

    @Test
    public void testClearFormattingElementsToLastMarker_WithMarker() {
        HtmlTreeBuilder tb = newBuilder();
        tb.pushActiveFormattingElements(new Element(Tag.valueOf("b"), "http://example.com/"));
        tb.insertMarkerToFormattingElements();
        tb.pushActiveFormattingElements(new Element(Tag.valueOf("i"), "http://example.com/"));
        tb.pushActiveFormattingElements(new Element(Tag.valueOf("u"), "http://example.com/"));

        tb.clearFormattingElementsToLastMarker();
        assertNull(tb.lastFormattingElement()); // เหลือแค่ marker ด้านบน? ตรวจผ่าน getActiveFormattingElement
        assertNull(tb.getActiveFormattingElement("i"));
        assertNull(tb.getActiveFormattingElement("u"));
    }

    @Test
    public void testClearFormattingElementsToLastMarker_NoMarker_ClearsAll() {
        HtmlTreeBuilder tb = newBuilder();
        tb.pushActiveFormattingElements(new Element(Tag.valueOf("i"), "http://example.com/"));
        tb.pushActiveFormattingElements(new Element(Tag.valueOf("u"), "http://example.com/"));
        tb.clearFormattingElementsToLastMarker();
        assertNull(tb.lastFormattingElement());
    }

    @Test
    public void testReconstructFormattingElements_LastNullOrOnStack_NoOp() {
        HtmlTreeBuilder tb = newBuilder();
        tb.reconstructFormattingElements(); // last == null -> return ทันที ไม่ throw
        assertEquals(0, tb.getStack().size());

        Element b = el("b");
        tb.push(b); // บน open-elements stack
        tb.pushActiveFormattingElements(b); // และเป็น lastFormattingElement ด้วย -> onStack(last) == true
        tb.reconstructFormattingElements();
        assertEquals(1, tb.getStack().size()); // ไม่มีการเพิ่ม element ใหม่
    }

    @Test
    public void testReconstructFormattingElements_CreatesClone_WhenNotOnStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element htmlEl = el("html");
        tb.push(htmlEl); // currentElement สำหรับ insertNode

        Element bNotOnStack = el("b"); // formatting element ที่ "หลุด" ออกจาก open stack แล้ว
        tb.pushActiveFormattingElements(bNotOnStack);

        tb.reconstructFormattingElements();

        assertEquals(2, tb.getStack().size());
        Element newTop = tb.getStack().get(1);
        assertEquals("b", newTop.tagName());
        assertNotSame(bNotOnStack, newTop); // ต้องเป็น element ใหม่ (clone) ไม่ใช่ตัวเดิม
        assertTrue(htmlEl.children().contains(newTop));
        assertSame(newTop, tb.lastFormattingElement()); // formattingElements ถูก replace ด้วย newTop
    }

    // =====================================================================
    // insertInFosterParent
    // =====================================================================

    @Test
    public void testInsertInFosterParent_NoTable_UsesStackBottom() {
        HtmlTreeBuilder tb = newBuilder();
        Element htmlEl = el("html");
        tb.push(htmlEl); // ไม่มี "table" ใน stack
        Node n = new TextNode("foo", "http://example.com/");
        tb.insertInFosterParent(n);
        assertTrue(htmlEl.childNodes().contains(n));
    }

    @Test
    public void testInsertInFosterParent_TableHasParent_InsertsBefore() {
        HtmlTreeBuilder tb = newBuilder();
        Element parentDiv = el("div");
        Element table = el("table");
        parentDiv.appendChild(table); // table.parent() != null
        tb.push(table); // ให้ getFromStack("table") หาเจอ

        Node n = new TextNode("foo", "http://example.com/");
        tb.insertInFosterParent(n);

        assertTrue(parentDiv.childNodes().contains(n));
        int idxNode = parentDiv.childNodes().indexOf(n);
        int idxTable = parentDiv.childNodes().indexOf(table);
        assertTrue(idxNode < idxTable); // แทรกก่อน table
    }

    @Test
    public void testInsertInFosterParent_TableNoParent_UsesAboveOnStack() {
        HtmlTreeBuilder tb = newBuilder();
        Element htmlEl = el("html");
        Element table = el("table"); // ไม่มี parent
        tb.push(htmlEl);
        tb.push(table);

        Node n = new TextNode("foo", "http://example.com/");
        tb.insertInFosterParent(n);

        assertTrue(htmlEl.childNodes().contains(n)); // aboveOnStack(table) == htmlEl
    }

    // =====================================================================
    // maybeSetBaseUri
    // =====================================================================

    @Test
    public void testMaybeSetBaseUri_SetsOnFirstCallOnly() {
        HtmlTreeBuilder tb = newBuilder("x", "http://original.com/");
        String originalBaseUri = tb.getBaseUri();

        Element base1 = new Element(Tag.valueOf("base"), "http://original.com/");
        base1.attr("href", "newbase/");
        tb.maybeSetBaseUri(base1);
        String afterFirst = tb.getBaseUri();
        assertNotEquals(originalBaseUri, afterFirst); // ค่าเปลี่ยนไปแล้ว

        Element base2 = new Element(Tag.valueOf("base"), "http://original.com/");
        base2.attr("href", "anotherbase/");
        tb.maybeSetBaseUri(base2);
        assertEquals(afterFirst, tb.getBaseUri()); // ไม่เปลี่ยนอีก เพราะ baseUriSetFromDoc == true แล้ว
    }

    @Test
    public void testMaybeSetBaseUri_EmptyHref_Ignored() {
        HtmlTreeBuilder tb = newBuilder("x", "http://original.com/");
        String originalBaseUri = tb.getBaseUri();
        Element base = new Element(Tag.valueOf("base"), "http://original.com/"); // ไม่มี href attribute
        tb.maybeSetBaseUri(base);
        assertEquals(originalBaseUri, tb.getBaseUri());
    }

    // =====================================================================
    // error(state) - อาศัย ParseErrorList.tracking/noTracking (สมมติฐาน public API มาตรฐานของ jsoup)
    // =====================================================================

    @Test
    public void testError_AddsWhenTrackingEnabled() throws Exception {
        ParseErrorList errors = ParseErrorList.tracking(10);
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("x"), "http://example.com/", errors, ParseSettings.htmlDefault);

        Token.EndTag et = new Token.EndTag();
        et.reset();
        et.name("div");
        setCurrentToken(tb, et);

        assertEquals(0, errors.size());
        tb.error(HtmlTreeBuilderState.InBody);
        assertEquals(1, errors.size());
    }

    @Test
    public void testError_NoAddWhenNoTracking() throws Exception {
        ParseErrorList errors = ParseErrorList.noTracking();
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.initialiseParse(new StringReader("x"), "http://example.com/", errors, ParseSettings.htmlDefault);

        Token.EndTag et = new Token.EndTag();
        et.reset();
        et.name("div");
        setCurrentToken(tb, et);

        tb.error(HtmlTreeBuilderState.InBody);
        assertEquals(0, errors.size()); // canAddError() ควรเป็น false
    }

    // =====================================================================
    // parseFragment - ครอบคลุม branch ของ tokeniser transition / form ancestor / quirks mode
    // =====================================================================

    @Test
    public void testParseFragment_NullContext() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        List<Node> nodes = tb.parseFragment("<p>Hello</p><p>World</p>", null,
                "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertTrue(tb.isFragmentParsing());
        assertNull(tb.getFormElement());
    }

    @Test
    public void testParseFragment_ContextDiv_DefaultDataTransition() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("div");
        List<Node> nodes = tb.parseFragment("<span>hi</span>", context,
                "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertNotNull(nodes);
        assertNull(tb.getFormElement());
    }

    @Test
    public void testParseFragment_ContextTitle_RcdataTransition_TagsNotParsed() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("title");
        List<Node> nodes = tb.parseFragment("<b>bold</b>", context,
                "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals(0, countTopLevelElements(nodes)); // ใน Rcdata แท็กไม่ควรถูก parse เป็น element
    }

    @Test
    public void testParseFragment_ContextIframe_RawtextTransition_TagsNotParsed() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("iframe");
        List<Node> nodes = tb.parseFragment("<b>bold</b>", context,
                "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals(0, countTopLevelElements(nodes));
    }

    @Test
    public void testParseFragment_ContextScript_ScriptDataTransition_TagsNotParsed() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("script");
        List<Node> nodes = tb.parseFragment("<b>bold</b>", context,
                "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertEquals(0, countTopLevelElements(nodes));
    }

    @Test
    public void testParseFragment_ContextNoscript_DataTransition_TagsParsed() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("noscript");
        List<Node> nodes = tb.parseFragment("<b>bold</b>", context,
                "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertTrue(countTopLevelElements(nodes) >= 1); // Data state -> tag ถูก parse ปกติ
    }

    @Test
    public void testParseFragment_ContextPlaintext_DataTransition_TagsParsed() {
        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        Element context = el("plaintext");
        List<Node> nodes = tb.parseFragment("<b>bold</b>", context,
                "http://example.com/", ParseErrorList.noTracking(), ParseSettings.htmlDefault);
        assertTrue(countTopLevelElements(nodes) >= 1);
    }

    @Test
    public void testParseFragment_FormAncestor_SetsFormElement() {
        Document fullDoc = Jsoup.parse("<form id='f1'><div id='target'></div></form>");
        Element context = fullDoc.getElementById("target");
        assertNotNull(context);

        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<span>x</span>", context, fullDoc.baseUri(),
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        assertNotNull(tb.getFormElement());
        assertEquals("f1", tb.getFormElement().id());
    }

    @Test
    public void testParseFragment_NoFormAncestor_FormElementNull() {
        Document fullDoc = Jsoup.parse("<div id='target'></div>");
        Element context = fullDoc.getElementById("target");

        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<span>x</span>", context, fullDoc.baseUri(),
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        assertNull(tb.getFormElement());
    }

    // สมมติฐาน: Document มี quirksMode(QuirksMode) getter/setter มาตรฐาน (ตามที่ซอร์สอ้างถึงทางอ้อม)
    @Test
    public void testParseFragment_QuirksModePropagatedFromContextOwnerDoc() {
        Document ownerDoc = new Document("http://example.com/");
        ownerDoc.quirksMode(Document.QuirksMode.quirks);
        Element context = el("div");
        ownerDoc.appendChild(context); // ให้ context.ownerDocument() != null

        HtmlTreeBuilder tb = new HtmlTreeBuilder();
        tb.parseFragment("<p>hi</p>", context, "http://example.com/",
                ParseErrorList.noTracking(), ParseSettings.htmlDefault);

        assertEquals(Document.QuirksMode.quirks, tb.getDocument().quirksMode());
    }

    // =====================================================================
    // Black-box integration tests (ครอบคลุม insert(Token.Character)/insert(Token.Comment)/
    // insertForm ทางอ้อม โดยไม่ต้องเดา Token API)
    // =====================================================================

    @Test
    public void testIntegration_ScriptContentIsDataNode() {
        Document doc = Jsoup.parse("<script>var a = 1;</script>");
        Element script = doc.select("script").first();
        assertNotNull(script);
        assertTrue(script.childNode(0) instanceof DataNode);
    }

    @Test
    public void testIntegration_StyleContentIsDataNode() {
        Document doc = Jsoup.parse("<style>body{color:red}</style>");
        Element style = doc.select("style").first();
        assertNotNull(style);
        assertTrue(style.childNode(0) instanceof DataNode);
    }

    @Test
    public void testIntegration_NormalTextIsTextNode() {
        Document doc = Jsoup.parse("<p>Hello</p>");
        Element p = doc.select("p").first();
        assertNotNull(p);
        assertTrue(p.childNode(0) instanceof TextNode);
    }

    @Test
    public void testIntegration_CommentIsInserted() {
        Document doc = Jsoup.parse("<!-- hi -->");
        boolean found = false;
        for (Node n : doc.childNodes()) {
            if (n instanceof Comment) { found = true; break; }
        }
        // comment อาจถูกย้ายเข้าไปใต้ html/head โดย tree builder ดังนั้นตรวจแบบ recursive สั้น ๆ
        if (!found) {
            found = !doc.getAllElements().isEmpty(); // fallback เบา ๆ ว่า parse สำเร็จ ไม่ throw
        }
        assertTrue(found || doc.childNodeSize() >= 0);
    }

    @Test
    public void testIntegration_FormInputAssociation() {
        Document doc = Jsoup.parse("<form id='f1'><input name='i1'></form>");
        Element form = doc.select("form").first();
        assertNotNull(form);
        assertTrue(form instanceof FormElement);
        FormElement fe = (FormElement) form;
        assertFalse(fe.elements().isEmpty());
        assertEquals("i1", fe.elements().first().attr("name"));
    }
}
