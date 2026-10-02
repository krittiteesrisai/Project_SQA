package org.apache.commons.jxpath.ri.axes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.axes.UnionContext; // import ตามข้อกำหนด (redundant เพราะ package เดียวกัน)

/**
 * Unit test สำหรับ {@link UnionContext} (Defects4J JxPath-15b)
 *
 * ข้อสมมติ (assumption) ที่ใช้เนื่องจากไม่มีซอร์สของ NodeSetContext/EvalContext ให้ดู:
 *  (A1) NodeSetContext(EvalContext parent, BasicNodeSet) รับ parent = null ได้
 *  (A2) NodeSetContext ปฏิบัติต่อ NodeSet ทั้งก้อนเป็น "set เดียว" คือ nextSet()
 *       จะ true หนึ่งครั้งแล้ว nextNode() จะไล่ pointer ทีละตัวจนหมดแล้ว false,
 *       จากนั้น nextSet() ครั้งที่สองจะ false (จบ outer while) — สอดคล้องกับ
 *       โครงสร้าง while(nextSet()){ while(nextNode()){...} } ใน UnionContext
 *  (A3) setPosition(position) คืน false เมื่อ position < 1 หรือเกินจำนวน pointer
 *       ทั้งหมด (ตามธรรมเนียม 1-based ของ JXPath)
 *  (A4) getDocumentOrder() ของ NodeSetContext ไม่ขึ้นกับเนื้อหาภายใน NodeSet
 *       (จึงเทียบค่ากับ instance เปล่าได้เพื่อตรวจสาขา else)
 */
public class UnionContextTest {

    private JXPathContext context;

    public static class SampleBean {
        private String name = "alpha";
        private String value = "beta";
        private String extra = "gamma";
        private List items;

        public SampleBean() {
            items = new ArrayList();
            items.add("x");
            items.add("y");
            items.add("z");
        }

        public String getName() { return name; }
        public String getValue() { return value; }
        public String getExtra() { return extra; }
        public List getItems() { return items; }
    }

    @Before
    public void setUp() {
        context = JXPathContext.newContext(new SampleBean());
    }

    // ---------- helper ----------

    /** ดึง NodePointer จริงจาก JXPathContext (ข้อเท็จจริงของ JXPath implementation) */
    private NodePointer samplePointer(String xpath) {
        return (NodePointer) context.getPointer(xpath);
    }

    /** สร้าง EvalContext จริง (NodeSetContext) ที่บรรจุ pointer ที่กำหนด, instance ใหม่เสมอ
     *  เพื่อไม่ให้ state ปนกันระหว่าง test */
    private EvalContext buildContext(NodePointer[] ptrs) {
        BasicNodeSet ns = new BasicNodeSet();
        for (int i = 0; i < ptrs.length; i++) {
            ns.add(ptrs[i]);
        }
        return new NodeSetContext(null, ns); // (A1)
    }

    // =========================================================
    // getDocumentOrder()
    // =========================================================

    @Test
    public void testGetDocumentOrder_MultipleContexts_ReturnsOne() {
        NodePointer ptrA = samplePointer("name");
        NodePointer ptrB = samplePointer("value");
        EvalContext ctx1 = buildContext(new NodePointer[]{ptrA});
        EvalContext ctx2 = buildContext(new NodePointer[]{ptrB});

        UnionContext union = new UnionContext(null, new EvalContext[]{ctx1, ctx2});

        // contexts.length (2) > 1  -> branch true -> return 1
        assertEquals(1, union.getDocumentOrder());
    }

    @Test
    public void testGetDocumentOrder_SingleContext_DelegatesToSuper() {
        NodePointer ptrA = samplePointer("name");
        EvalContext ctx1 = buildContext(new NodePointer[]{ptrA});

        UnionContext union = new UnionContext(null, new EvalContext[]{ctx1});
        NodeSetContext plain = new NodeSetContext(null, new BasicNodeSet());

        // contexts.length (1) > 1 เป็น false (boundary) -> ใช้ super.getDocumentOrder() (A4)
        assertEquals(plain.getDocumentOrder(), union.getDocumentOrder());
    }

    @Test
    public void testGetDocumentOrder_EmptyContexts_DelegatesToSuper() {
        UnionContext union = new UnionContext(null, new EvalContext[0]);
        NodeSetContext plain = new NodeSetContext(null, new BasicNodeSet());

        // contexts.length (0) > 1 เป็น false -> ใช้ super.getDocumentOrder() (A4)
        assertEquals(plain.getDocumentOrder(), union.getDocumentOrder());
    }

    // =========================================================
    // setPosition() - โครงสร้าง loop / เงื่อนไข dedup / prepared flag
    // =========================================================

    @Test
    public void testSetPosition_EmptyContextsArray_ReturnsFalse() {
        UnionContext union = new UnionContext(null, new EvalContext[0]);
        // for-loop ทำงาน 0 รอบ -> ไม่มี pointer ถูกเพิ่ม
        assertFalse(union.setPosition(1));
    }

    @Test
    public void testSetPosition_SingleContextSinglePointer() {
        NodePointer ptrA = samplePointer("name");
        EvalContext ctx1 = buildContext(new NodePointer[]{ptrA});
        UnionContext union = new UnionContext(null, new EvalContext[]{ctx1});

        assertTrue(union.setPosition(1));
        assertEquals(ptrA, union.getCurrentNodePointer());
        assertFalse(union.setPosition(2));
    }

    @Test
    public void testSetPosition_MergesMultipleContextsNoDuplicates() {
        NodePointer ptrA = samplePointer("name");
        NodePointer ptrB = samplePointer("value");
        EvalContext ctx1 = buildContext(new NodePointer[]{ptrA});
        EvalContext ctx2 = buildContext(new NodePointer[]{ptrB});

        UnionContext union = new UnionContext(null, new EvalContext[]{ctx1, ctx2});

        assertTrue(union.setPosition(1));
        assertEquals(ptrA, union.getCurrentNodePointer());
        assertTrue(union.setPosition(2));
        assertEquals(ptrB, union.getCurrentNodePointer());
        assertFalse(union.setPosition(3));
    }

    @Test
    public void testSetPosition_DuplicatePointerAcrossContexts_FilteredOnce() {
        // จุดที่มีโอกาสดัก fault มากที่สุด: if (!pointers.contains(ptr))
        NodePointer ptrA = samplePointer("name");
        NodePointer ptrB = samplePointer("value");
        NodePointer ptrC = samplePointer("extra");

        EvalContext ctx1 = buildContext(new NodePointer[]{ptrA, ptrB});
        EvalContext ctx2 = buildContext(new NodePointer[]{ptrB, ptrC}); // ptrB ซ้ำข้าม context

        UnionContext union = new UnionContext(null, new EvalContext[]{ctx1, ctx2});

        int count = 0;
        Set seen = new HashSet();
        while (union.setPosition(count + 1)) {
            NodePointer p = union.getCurrentNodePointer();
            assertTrue("พบ pointer ซ้ำ ซึ่งไม่ควรเกิดขึ้น", seen.add(p));
            count++;
        }
        assertEquals(3, count); // ptrA, ptrB(ครั้งเดียว), ptrC
    }

    @Test
    public void testSetPosition_ContextWithEmptyNodeSet_SkippedGracefully() {
        // inner while(ctx.nextNode()) ทำงาน 0 รอบสำหรับ context ว่าง (A2)
        NodePointer ptrA = samplePointer("name");
        EvalContext emptyCtx = buildContext(new NodePointer[0]);
        EvalContext ctx1 = buildContext(new NodePointer[]{ptrA});

        UnionContext union = new UnionContext(null, new EvalContext[]{emptyCtx, ctx1});

        assertTrue(union.setPosition(1));
        assertEquals(ptrA, union.getCurrentNodePointer());
        assertFalse(union.setPosition(2));
    }

    @Test
    public void testSetPosition_IdempotentAfterFirstPreparation() {
        // ตรวจสาขา if (!prepared) ว่าทำงานครั้งเดียว ผลลัพธ์ย้อนไปมาต้องคงที่
        NodePointer ptrA = samplePointer("name");
        NodePointer ptrB = samplePointer("value");
        EvalContext ctx1 = buildContext(new NodePointer[]{ptrA});
        EvalContext ctx2 = buildContext(new NodePointer[]{ptrB});

        UnionContext union = new UnionContext(null, new EvalContext[]{ctx1, ctx2});

        assertTrue(union.setPosition(2));
        assertEquals(ptrB, union.getCurrentNodePointer());

        assertTrue(union.setPosition(1));
        assertEquals(ptrA, union.getCurrentNodePointer());

        assertTrue(union.setPosition(2));
        assertEquals(ptrB, union.getCurrentNodePointer());
        assertFalse(union.setPosition(3));
    }

    @Test
    public void testSetPosition_BoundaryZeroAndNegativePosition() {
        NodePointer ptrA = samplePointer("name");
        EvalContext ctx1 = buildContext(new NodePointer[]{ptrA});
        UnionContext union = new UnionContext(null, new EvalContext[]{ctx1});

        // (A3) position < 1 ถือว่าไม่ถูกต้อง
        assertFalse(union.setPosition(0));
        assertFalse(union.setPosition(-1));
        assertTrue(union.setPosition(1));
    }

    @Test
    public void testSetPosition_BoundaryLastAndPastLast() {
        NodePointer ptrA = samplePointer("name");
        NodePointer ptrB = samplePointer("value");
        EvalContext ctx1 = buildContext(new NodePointer[]{ptrA, ptrB});
        UnionContext union = new UnionContext(null, new EvalContext[]{ctx1});

        assertTrue(union.setPosition(2));   // ตำแหน่งสุดท้ายที่ถูกต้อง
        assertFalse(union.setPosition(3));  // เกินขอบเขต
    }

    @Test
    public void testUnionContextIsEvalContext() {
        UnionContext union = new UnionContext(null, new EvalContext[0]);
        assertTrue(union instanceof EvalContext);
    }

    // =========================================================
    // Black-box ผ่าน XPath union operator "|" (ทดสอบ end-to-end / ดัก fault เชิงพฤติกรรม)
    // =========================================================

    @Test
    public void testUnionXPath_NoOverlap_ReturnsCombinedResults() {
        List results = new ArrayList();
        Iterator it = context.iterate("name | value");
        while (it.hasNext()) {
            results.add(it.next());
        }
        assertEquals(2, results.size());
        assertTrue(results.contains("alpha"));
        assertTrue(results.contains("beta"));
    }

    @Test
    public void testUnionXPath_SelfUnionOnList_DeduplicatesAllItems() {
        // Fault-detection: union ของ path เดียวกันซ้ำสองรอบ ต้องไม่ได้ผลลัพธ์ซ้ำ
        List results = new ArrayList();
        Iterator it = context.iterate("items | items");
        while (it.hasNext()) {
            results.add(it.next());
        }
        assertEquals(3, results.size());
    }

    @Test
    public void testUnionXPath_PartialOverlapOnList() {
        List results = new ArrayList();
        Iterator it = context.iterate("items | items[1]");
        while (it.hasNext()) {
            results.add(it.next());
        }
        // items มี 3 ตัว, items[1] ซ้ำกับตัวแรก -> ยังคงเหลือ 3 รายการ unique
        assertEquals(3, results.size());
    }

    @Test
    public void testUnionXPath_EmptyBothSides_ReturnsEmpty() {
        // path ที่ไม่มีผลลัพธ์ทั้งสองฝั่ง
        List results = new ArrayList();
        Iterator it = context.iterate("nonExist1 | nonExist2");
        while (it.hasNext()) {
            results.add(it.next());
        }
        assertEquals(0, results.size());
    }
}
