package org.apache.commons.jxpath.ri.axes;

import static org.junit.Assert.*;

import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AttributeContextTest {

    /**
     * Stub EvalContext ใช้แทน parentContext
     * หมายเหตุ: ซอร์สของ EvalContext ไม่ได้ให้มา จึง override ครบทั้ง
     * getCurrentNodePointer()/nextNode()/setPosition(int)/reset() (ซึ่งเป็นสิ่งที่
     * ทราบแน่ชัดว่ามีอยู่จริงเพราะ AttributeContext เองก็ override 4 เมธอดนี้)
     * เพื่อลดความเสี่ยงเรื่อง compile หากเมธอดเหล่านี้เป็น abstract
     */
    private static class StubParentContext extends EvalContext {
        private final NodePointer pointer;

        StubParentContext(NodePointer pointer) {
            super(null);
            this.pointer = pointer;
        }

        public NodePointer getCurrentNodePointer() {
            return pointer;
        }

        public boolean nextNode() {
            return false;
        }

        public boolean setPosition(int position) {
            return false;
        }

        public void reset() {
            // no-op สำหรับ stub
        }
    }

    private Element createElementWithAttribute(String attrName, String attrValue)
            throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();
        Element root = doc.createElement("root");
        if (attrName != null) {
            root.setAttribute(attrName, attrValue);
        }
        doc.appendChild(root);
        return root;
    }

    // ---------- initial state ----------

    @Test
    public void testInitialState_currentNodePointerIsNull() {
        // สมมติว่า NodeTest เป็น marker interface (ไม่มีเมธอดที่ต้อง implement)
        // เนื่องจากซอร์สของ NodeTest ไม่ได้ถูกให้มา
        NodeTest dummyTest = new NodeTest() { };
        StubParentContext parent = new StubParentContext(null);
        AttributeContext context = new AttributeContext(parent, dummyTest);

        assertNull("currentNodePointer ควรเป็น null ก่อนเรียก nextNode()",
                context.getCurrentNodePointer());
        assertEquals(0, context.getCurrentPosition());
    }

    // ---------- nextNode(): nodeTest ไม่ใช่ NodeNameTest ----------

    @Test
    public void testNextNode_whenNodeTestIsNotNodeNameTest_returnsFalse() {
        NodeTest dummyTest = new NodeTest() { };
        StubParentContext parent = new StubParentContext(null);
        AttributeContext context = new AttributeContext(parent, dummyTest);

        assertFalse(context.nextNode());
        // super.setPosition(getCurrentPosition()+1) ถูกเรียกก่อนเช็ค setStarted
        assertEquals(1, context.getCurrentPosition());
    }

    @Test
    public void testNextNode_calledTwice_whenNodeTestIsNotNodeNameTest_bothReturnFalse() {
        NodeTest dummyTest = new NodeTest() { };
        StubParentContext parent = new StubParentContext(null);
        AttributeContext context = new AttributeContext(parent, dummyTest);

        assertFalse(context.nextNode()); // setStarted=false->true, !instanceof -> false
        assertFalse(context.nextNode()); // setStarted=true, iterator==null -> false
        assertEquals(2, context.getCurrentPosition());
    }

    @Test
    public void testNextNode_whenNodeTestIsNull_returnsFalseWithoutException() {
        // null instanceof NodeNameTest == false เสมอ -> ไม่เกิด NPE
        StubParentContext parent = new StubParentContext(null);
        AttributeContext context = new AttributeContext(parent, null);

        assertFalse(context.nextNode());
    }

    // ---------- setPosition(): nextNode() ล้มเหลวเสมอ ----------

    @Test
    public void testSetPosition_zeroWithoutAdvancing_returnsTrue() {
        NodeTest dummyTest = new NodeTest() { };
        StubParentContext parent = new StubParentContext(null);
        AttributeContext context = new AttributeContext(parent, dummyTest);

        // 0 < 0 == false -> ไม่ reset ; while(0<0)==false -> ไม่เข้า loop -> true
        assertTrue(context.setPosition(0));
        assertEquals(0, context.getCurrentPosition());
    }

    @Test
    public void testSetPosition_positivePosition_whenNextNodeAlwaysFalse_returnsFalse() {
        NodeTest dummyTest = new NodeTest() { };
        StubParentContext parent = new StubParentContext(null);
        AttributeContext context = new AttributeContext(parent, dummyTest);

        assertFalse(context.setPosition(1));
    }

    @Test
    public void testSetPosition_negativePosition_triggersResetAndReturnsTrue() {
        NodeTest dummyTest = new NodeTest() { };
        StubParentContext parent = new StubParentContext(null);
        AttributeContext context = new AttributeContext(parent, dummyTest);

        context.nextNode();
        assertTrue(context.getCurrentPosition() > 0);

        // -1 < currentPosition -> true -> reset(); แล้ว while(0 < -1)==false -> true
        assertTrue(context.setPosition(-1));
        assertEquals(0, context.getCurrentPosition());
    }

    // ---------- reset() ----------

    @Test
    public void testReset_resetsPosition() {
        NodeTest dummyTest = new NodeTest() { };
        StubParentContext parent = new StubParentContext(null);
        AttributeContext context = new AttributeContext(parent, dummyTest);

        context.nextNode();
        assertEquals(1, context.getCurrentPosition());

        context.reset();
        assertEquals(0, context.getCurrentPosition());
        // currentNodePointer ไม่เคยถูกตั้งค่าในกรณีนี้ (branch ที่ไม่ใช่ NodeNameTest)
        // จึงยังเป็น null อยู่ (reset() ไม่ได้ clear field นี้โดยตรงตามซอร์ส)
        assertNull(context.getCurrentNodePointer());
    }

    // ---------- nextNode()/setPosition(): nodeTest เป็น NodeNameTest จริง + DOM attribute ----------
    // หมายเหตุ: สมมติ constructor ของ DOMNodePointer คือ (org.w3c.dom.Node, java.util.Locale)
    // และ QName มี constructor (String prefix, String name) ตามที่ใช้งานทั่วไปใน jxpath

    @Test
    public void testNextNode_withMatchingAttribute_returnsTrueAndSetsCurrentNodePointer()
            throws Exception {
        Element root = createElementWithAttribute("attr1", "value1");
        NodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());

        StubParentContext parent = new StubParentContext(rootPointer);
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr1"));
        AttributeContext context = new AttributeContext(parent, nodeTest);

        assertTrue(context.nextNode());
        assertNotNull(context.getCurrentNodePointer());
        assertEquals(1, context.getCurrentPosition());

        // ไม่มี attribute "attr1" ตัวที่ 2 -> เรียกซ้ำควรได้ false
        assertFalse(context.nextNode());
    }

    @Test
    public void testNextNode_withNonMatchingAttributeName_returnsFalse() throws Exception {
        Element root = createElementWithAttribute("attr1", "value1");
        NodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());

        StubParentContext parent = new StubParentContext(rootPointer);
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "doesNotExist"));
        AttributeContext context = new AttributeContext(parent, nodeTest);

        // อาจเป็น false เพราะ iterator==null หรือ iterator.setPosition(1) ล้มเหลว
        // (ขึ้นกับ implementation ภายในของ DOMNodePointer.attributeIterator ซึ่งไม่ได้ให้มา)
        assertFalse(context.nextNode());
    }

    @Test
    public void testNextNode_whenElementHasNoAttributeAtAll_returnsFalse() throws Exception {
        Element root = createElementWithAttribute(null, null);
        NodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());

        StubParentContext parent = new StubParentContext(rootPointer);
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr1"));
        AttributeContext context = new AttributeContext(parent, nodeTest);

        assertFalse(context.nextNode());
    }

    @Test
    public void testSetPosition_withMatchingAttribute_positionOne_returnsTrue() throws Exception {
        Element root = createElementWithAttribute("attr1", "value1");
        NodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());

        StubParentContext parent = new StubParentContext(rootPointer);
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr1"));
        AttributeContext context = new AttributeContext(parent, nodeTest);

        assertTrue(context.setPosition(1));
        assertEquals(1, context.getCurrentPosition());
    }

    @Test
    public void testSetPosition_equalToCurrentPosition_returnsTrueWithoutFurtherAdvance()
            throws Exception {
        Element root = createElementWithAttribute("attr1", "value1");
        NodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());

        StubParentContext parent = new StubParentContext(rootPointer);
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr1"));
        AttributeContext context = new AttributeContext(parent, nodeTest);

        assertTrue(context.nextNode());
        assertEquals(1, context.getCurrentPosition());

        // position == currentPosition -> ไม่ reset, ไม่เข้า while loop -> true ทันที
        assertTrue(context.setPosition(1));
        assertEquals(1, context.getCurrentPosition());
    }

    @Test
    public void testSetPosition_beyondAvailableAttribute_returnsFalse() throws Exception {
        Element root = createElementWithAttribute("attr1", "value1");
        NodePointer rootPointer = new DOMNodePointer(root, Locale.getDefault());

        StubParentContext parent = new StubParentContext(rootPointer);
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr1"));
        AttributeContext context = new AttributeContext(parent, nodeTest);

        // มี attribute ที่ match ได้แค่ 1 ตัว แต่ขอ position = 2
        assertFalse(context.setPosition(2));
    }

    // ---------- null pointer ของ parentContext.getCurrentNodePointer() ----------

    @Test(expected = NullPointerException.class)
    public void testNextNode_whenParentCurrentNodePointerIsNull_throwsNPE() {
        // nodeTest เป็น NodeNameTest แต่ parentContext.getCurrentNodePointer() คืนค่า null
        // โค้ดต้นฉบับไม่มีการตรวจสอบ null ก่อนเรียก .attributeIterator(name)
        // จึงคาดว่าจะเกิด NullPointerException (ทดสอบเพื่อดักจับ fault ด้าน null-safety)
        StubParentContext parent = new StubParentContext(null);
        NodeNameTest nodeTest = new NodeNameTest(new QName(null, "attr1"));
        AttributeContext context = new AttributeContext(parent, nodeTest);

        context.nextNode();
    }
}
