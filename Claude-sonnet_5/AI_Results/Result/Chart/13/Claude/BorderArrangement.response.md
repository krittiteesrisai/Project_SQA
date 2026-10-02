# วิเคราะห์และแผนการทดสอบ

จากซอร์สโค้ด `BorderArrangement` มีจุดที่ต้องครอบคลุม:
- `add()`: key เป็น null / TOP / BOTTOM / LEFT / RIGHT / key ผิดชนิด (ClassCastException) / block เป็น null
- `arrange()`: 9 combination ของ (NONE/FIXED/RANGE) × (NONE/FIXED/RANGE) → เรียก `arrangeNN`, `arrangeFN`, `arrangeFF`, `arrangeFR`, `arrangeRR` หรือ throw RuntimeException
- `arrangeFR`: branch ที่ height อยู่ใน range และไม่อยู่ใน range
- `clear()`, `equals()` ทุก field/branch
- boundary case: ไม่มี block เลย, มีแค่ center, width/dimension = 0

**หมายเหตุสมมติฐานที่ใช้ (คอมเมนต์ไว้ในโค้ด):**
- `BlockContainer` แบบ default มี margin/border/padding เป็นศูนย์ ทำให้ `toContentConstraint`, `calculateTotalWidth/Height` ทำงานแบบ identity (ค่าคงเดิม)
- `EmptyBlock.arrange(...)` คืนขนาดของตัวเองเสมอ โดยไม่สนใจ `constraint` ที่รับเข้ามา (ตาม implementation จริงของ JFreeChart)
- ทั้งสองข้อนี้ใช้เพื่อคำนวณค่าที่คาดหวัง (expected) แบบ manual ตามสูตรในซอร์สโค้ดที่ให้มาเท่านั้น ไม่ได้เดา behavior เพิ่มเติม

```java
import static org.junit.Assert.*;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.junit.Before;
import org.junit.Test;

import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;

/**
 * JUnit4 tests for {@link BorderArrangement} (Defects4J Chart-13b).
 */
public class BorderArrangementTest {

    // ---- ขนาด block มาตรฐานที่ใช้คำนวณค่า expected แบบ manual ----
    private static final double TOP_W = 100, TOP_H = 10;
    private static final double BOTTOM_W = 100, BOTTOM_H = 20;
    private static final double LEFT_W = 30, LEFT_H = 50;
    private static final double RIGHT_W = 40, RIGHT_H = 60;
    private static final double CENTER_W = 200, CENTER_H = 150;

    private BorderArrangement arrangement;
    private Graphics2D g2;

    @Before
    public void setUp() {
        this.arrangement = new BorderArrangement();
        BufferedImage img = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        this.g2 = img.createGraphics();
    }

    private BlockContainer newContainer() {
        return new BlockContainer(this.arrangement);
    }

    // =========================================================
    // add()
    // =========================================================

    @Test
    public void testAdd_CenterBlock_NullKey() {
        Block center = new EmptyBlock(CENTER_W, CENTER_H);
        arrangement.add(center, null);
        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, RectangleConstraint.NONE);
        // มีแค่ center: width = 0+CENTER_W+0, height = CENTER_H
        assertEquals(CENTER_W, size.getWidth(), 0.0001);
        assertEquals(CENTER_H, size.getHeight(), 0.0001);
    }

    @Test
    public void testAdd_TopBottomLeftRightBlocks() {
        Block top = new EmptyBlock(TOP_W, TOP_H);
        Block bottom = new EmptyBlock(BOTTOM_W, BOTTOM_H);
        Block left = new EmptyBlock(LEFT_W, LEFT_H);
        Block right = new EmptyBlock(RIGHT_W, RIGHT_H);

        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);

        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, RectangleConstraint.NONE);

        double width = Math.max(TOP_W, Math.max(BOTTOM_W, LEFT_W + 0 + RIGHT_W));
        double centerHeight = Math.max(LEFT_H, Math.max(RIGHT_H, 0)); // no center block
        double height = TOP_H + BOTTOM_H + centerHeight;

        assertEquals(width, size.getWidth(), 0.0001);
        assertEquals(height, size.getHeight(), 0.0001);

        // ตรวจ bounds ของ top block ว่าถูก setBounds ตามสูตร
        assertEquals(new Rectangle2D.Double(0.0, 0.0, width, TOP_H), top.getBounds());
    }

    @Test
    public void testAdd_NullBlock_DoesNotThrow_AndTreatedAsAbsent() {
        // เพิ่ม null block ที่ TOP -> topBlock จะถูกกำหนดเป็น null (ไม่ crash)
        arrangement.add(null, RectangleEdge.TOP);
        Block bottom = new EmptyBlock(BOTTOM_W, BOTTOM_H);
        arrangement.add(bottom, RectangleEdge.BOTTOM);

        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, RectangleConstraint.NONE);

        // เสมือนไม่มี top block เลย (h0 = 0)
        assertEquals(BOTTOM_W, size.getWidth(), 0.0001);
        assertEquals(BOTTOM_H, size.getHeight(), 0.0001);
    }

    @Test(expected = ClassCastException.class)
    public void testAdd_InvalidKeyType_ThrowsClassCastException() {
        Block block = new EmptyBlock(10, 10);
        // key ที่ไม่ใช่ RectangleEdge และไม่ใช่ null -> cast ผิดพลาด
        arrangement.add(block, "INVALID_KEY");
    }

    // =========================================================
    // equals()
    // =========================================================

    @Test
    public void testEquals_SameInstance() {
        assertTrue(arrangement.equals(arrangement));
    }

    @Test
    public void testEquals_NullObject() {
        assertFalse(arrangement.equals(null));
    }

    @Test
    public void testEquals_DifferentClass() {
        assertFalse(arrangement.equals("not a BorderArrangement"));
    }

    @Test
    public void testEquals_TwoEmptyArrangements() {
        BorderArrangement other = new BorderArrangement();
        assertTrue(arrangement.equals(other));
        assertTrue(other.equals(arrangement));
    }

    @Test
    public void testEquals_DifferentTopBlock() {
        BorderArrangement other = new BorderArrangement();
        arrangement.add(new EmptyBlock(10, 10), RectangleEdge.TOP);
        other.add(new EmptyBlock(20, 20), RectangleEdge.TOP);
        assertFalse(arrangement.equals(other));
    }

    @Test
    public void testEquals_DifferentBottomBlock() {
        Block sharedTop = new EmptyBlock(10, 10);
        BorderArrangement other = new BorderArrangement();
        arrangement.add(sharedTop, RectangleEdge.TOP);
        other.add(sharedTop, RectangleEdge.TOP);
        arrangement.add(new EmptyBlock(1, 1), RectangleEdge.BOTTOM);
        other.add(new EmptyBlock(2, 2), RectangleEdge.BOTTOM);
        assertFalse(arrangement.equals(other));
    }

    @Test
    public void testEquals_DifferentLeftBlock() {
        BorderArrangement other = new BorderArrangement();
        arrangement.add(new EmptyBlock(1, 1), RectangleEdge.LEFT);
        other.add(new EmptyBlock(2, 2), RectangleEdge.LEFT);
        assertFalse(arrangement.equals(other));
    }

    @Test
    public void testEquals_DifferentRightBlock() {
        BorderArrangement other = new BorderArrangement();
        arrangement.add(new EmptyBlock(1, 1), RectangleEdge.RIGHT);
        other.add(new EmptyBlock(2, 2), RectangleEdge.RIGHT);
        assertFalse(arrangement.equals(other));
    }

    @Test
    public void testEquals_DifferentCenterBlock() {
        BorderArrangement other = new BorderArrangement();
        arrangement.add(new EmptyBlock(1, 1), null);
        other.add(new EmptyBlock(2, 2), null);
        assertFalse(arrangement.equals(other));
    }

    @Test
    public void testEquals_AllFieldsSame() {
        Block top = new EmptyBlock(1, 1);
        Block bottom = new EmptyBlock(2, 2);
        Block left = new EmptyBlock(3, 3);
        Block right = new EmptyBlock(4, 4);
        Block center = new EmptyBlock(5, 5);

        BorderArrangement other = new BorderArrangement();
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        other.add(top, RectangleEdge.TOP);
        other.add(bottom, RectangleEdge.BOTTOM);
        other.add(left, RectangleEdge.LEFT);
        other.add(right, RectangleEdge.RIGHT);
        other.add(center, null);

        assertTrue(arrangement.equals(other));
    }

    // =========================================================
    // clear()
    // =========================================================

    @Test
    public void testClear_ResetsAllFields() {
        arrangement.add(new EmptyBlock(1, 1), RectangleEdge.TOP);
        arrangement.add(new EmptyBlock(2, 2), RectangleEdge.BOTTOM);
        arrangement.add(new EmptyBlock(3, 3), RectangleEdge.LEFT);
        arrangement.add(new EmptyBlock(4, 4), RectangleEdge.RIGHT);
        arrangement.add(new EmptyBlock(5, 5), null);

        arrangement.clear();

        assertTrue(arrangement.equals(new BorderArrangement()));

        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, RectangleConstraint.NONE);
        assertEquals(0.0, size.getWidth(), 0.0001);
        assertEquals(0.0, size.getHeight(), 0.0001);
    }

    // =========================================================
    // arrange(): NONE / NONE -> arrangeNN
    // =========================================================

    @Test
    public void testArrange_NoneNone_AllBlocksPresent() {
        Block top = new EmptyBlock(TOP_W, TOP_H);
        Block bottom = new EmptyBlock(BOTTOM_W, BOTTOM_H);
        Block left = new EmptyBlock(LEFT_W, LEFT_H);
        Block right = new EmptyBlock(RIGHT_W, RIGHT_H);
        Block center = new EmptyBlock(CENTER_W, CENTER_H);

        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, RectangleConstraint.NONE);

        double width = 270.0;   // max(100,100,30+200+40)
        double height = 180.0;  // 10+20+max(60,60,150)

        assertEquals(width, size.getWidth(), 0.0001);
        assertEquals(height, size.getHeight(), 0.0001);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 270.0, 10.0), top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 160.0, 270.0, 20.0), bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 10.0, 30.0, 150.0), left.getBounds());
        assertEquals(new Rectangle2D.Double(230.0, 10.0, 40.0, 150.0), right.getBounds());
        assertEquals(new Rectangle2D.Double(30.0, 10.0, 200.0, 150.0), center.getBounds());
    }

    @Test
    public void testArrange_NoneNone_OnlyCenterBlock() {
        Block center = new EmptyBlock(CENTER_W, CENTER_H);
        arrangement.add(center, null);
        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, RectangleConstraint.NONE);
        assertEquals(CENTER_W, size.getWidth(), 0.0001);
        assertEquals(CENTER_H, size.getHeight(), 0.0001);
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 200.0, 150.0), center.getBounds());
    }

    @Test
    public void testArrange_NoneNone_NoBlocksAtAll() {
        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, RectangleConstraint.NONE);
        assertEquals(0.0, size.getWidth(), 0.0001);
        assertEquals(0.0, size.getHeight(), 0.0001);
    }

    // =========================================================
    // arrange(): NONE / FIXED และ NONE / RANGE -> RuntimeException
    // =========================================================

    @Test
    public void testArrange_NoneFixed_ThrowsRuntimeException() {
        RectangleConstraint c = new RectangleConstraint(0.0, null,
                LengthConstraintType.NONE, 50.0, null, LengthConstraintType.FIXED);
        BlockContainer container = newContainer();
        try {
            arrangement.arrange(container, g2, c);
            fail("ควร throw RuntimeException");
        } catch (RuntimeException ex) {
            assertEquals("Not implemented.", ex.getMessage());
        }
    }

    @Test
    public void testArrange_NoneRange_ThrowsRuntimeException() {
        RectangleConstraint c = new RectangleConstraint(0.0, null,
                LengthConstraintType.NONE, 0.0, new Range(10, 50),
                LengthConstraintType.RANGE);
        BlockContainer container = newContainer();
        try {
            arrangement.arrange(container, g2, c);
            fail("ควร throw RuntimeException");
        } catch (RuntimeException ex) {
            assertEquals("Not implemented.", ex.getMessage());
        }
    }

    // =========================================================
    // arrange(): FIXED / NONE -> arrangeFN
    // =========================================================

    @Test
    public void testArrange_FixedNone_AllBlocksPresent() {
        Block top = new EmptyBlock(TOP_W, TOP_H);
        Block bottom = new EmptyBlock(BOTTOM_W, BOTTOM_H);
        Block left = new EmptyBlock(LEFT_W, LEFT_H);
        Block right = new EmptyBlock(RIGHT_W, RIGHT_H);
        Block center = new EmptyBlock(CENTER_W, CENTER_H);

        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        RectangleConstraint c = new RectangleConstraint(250.0, null,
                LengthConstraintType.FIXED, 0.0, null, LengthConstraintType.NONE);
        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, c);

        // คำนวณตามสูตรใน arrangeFN -> ภายในเรียก arrangeFF(250,180)
        assertEquals(250.0, size.getWidth(), 0.0001);
        assertEquals(180.0, size.getHeight(), 0.0001);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 250.0, 10.0), top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 160.0, 250.0, 20.0), bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 10.0, 30.0, 150.0), left.getBounds());
        assertEquals(new Rectangle2D.Double(210.0, 10.0, 40.0, 150.0), right.getBounds());
        assertEquals(new Rectangle2D.Double(30.0, 10.0, 180.0, 150.0), center.getBounds());
    }

    @Test
    public void testArrange_FixedNone_BoundaryZeroWidth() {
        // boundary case: fixed width = 0
        Block top = new EmptyBlock(TOP_W, TOP_H);
        Block bottom = new EmptyBlock(BOTTOM_W, BOTTOM_H);
        Block left = new EmptyBlock(LEFT_W, LEFT_H);
        Block right = new EmptyBlock(RIGHT_W, RIGHT_H);
        Block center = new EmptyBlock(CENTER_W, CENTER_H);

        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        RectangleConstraint c = new RectangleConstraint(0.0, null,
                LengthConstraintType.FIXED, 0.0, null, LengthConstraintType.NONE);
        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, c);

        assertEquals(0.0, size.getWidth(), 0.0001);
        assertEquals(180.0, size.getHeight(), 0.0001);
    }

    // =========================================================
    // arrange(): FIXED / FIXED -> arrangeFF
    // =========================================================

    @Test
    public void testArrange_FixedFixed_AllBlocksPresent() {
        Block top = new EmptyBlock(TOP_W, TOP_H);
        Block bottom = new EmptyBlock(BOTTOM_W, BOTTOM_H);
        Block left = new EmptyBlock(LEFT_W, LEFT_H);
        Block right = new EmptyBlock(RIGHT_W, RIGHT_H);
        Block center = new EmptyBlock(CENTER_W, CENTER_H);

        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        RectangleConstraint c = new RectangleConstraint(300.0, 200.0);
        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, c);

        assertEquals(300.0, size.getWidth(), 0.0001);
        assertEquals(200.0, size.getHeight(), 0.0001);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 300.0, 10.0), top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 180.0, 300.0, 20.0), bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 10.0, 30.0, 170.0), left.getBounds());
        assertEquals(new Rectangle2D.Double(260.0, 10.0, 40.0, 170.0), right.getBounds());
        assertEquals(new Rectangle2D.Double(30.0, 10.0, 230.0, 170.0), center.getBounds());
    }

    @Test
    public void testArrange_FixedFixed_NoBlocks() {
        RectangleConstraint c = new RectangleConstraint(100.0, 80.0);
        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, c);
        // arrangeFF คืนขนาดของ constraint เสมอ ไม่ว่าจะมี block หรือไม่
        assertEquals(100.0, size.getWidth(), 0.0001);
        assertEquals(80.0, size.getHeight(), 0.0001);
    }

    // =========================================================
    // arrange(): FIXED / RANGE -> arrangeFR (2 branches)
    // =========================================================

    @Test
    public void testArrange_FixedRange_WithinRange() {
        Block top = new EmptyBlock(TOP_W, TOP_H);
        Block bottom = new EmptyBlock(BOTTOM_W, BOTTOM_H);
        Block left = new EmptyBlock(LEFT_W, LEFT_H);
        Block right = new EmptyBlock(RIGHT_W, RIGHT_H);
        Block center = new EmptyBlock(CENTER_W, CENTER_H);

        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        // arrangeFN(250) -> height = 180 อยู่ใน range(100,300) -> คืนค่าตรง (branch contains=true)
        RectangleConstraint c = new RectangleConstraint(250.0, null,
                LengthConstraintType.FIXED, 0.0, new Range(100, 300),
                LengthConstraintType.RANGE);
        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, c);

        assertEquals(250.0, size.getWidth(), 0.0001);
        assertEquals(180.0, size.getHeight(), 0.0001);
    }

    @Test
    public void testArrange_FixedRange_OutsideRange() {
        Block top = new EmptyBlock(TOP_W, TOP_H);
        Block bottom = new EmptyBlock(BOTTOM_W, BOTTOM_H);
        Block left = new EmptyBlock(LEFT_W, LEFT_H);
        Block right = new EmptyBlock(RIGHT_W, RIGHT_H);
        Block center = new EmptyBlock(CENTER_W, CENTER_H);

        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        // arrangeFN(250) -> height = 180 ไม่อยู่ใน range(0,50)
        // -> constrain เป็น 50 -> เรียก arrangeFF(250,50) (branch contains=false)
        RectangleConstraint c = new RectangleConstraint(250.0, null,
                LengthConstraintType.FIXED, 0.0, new Range(0, 50),
                LengthConstraintType.RANGE);
        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, c);

        assertEquals(250.0, size.getWidth(), 0.0001);
        assertEquals(50.0, size.getHeight(), 0.0001);
    }

    // =========================================================
    // arrange(): RANGE / NONE และ RANGE / FIXED -> RuntimeException
    // =========================================================

    @Test
    public void testArrange_RangeNone_ThrowsRuntimeException() {
        RectangleConstraint c = new RectangleConstraint(0.0, new Range(10, 50),
                LengthConstraintType.RANGE, 0.0, null, LengthConstraintType.NONE);
        BlockContainer container = newContainer();
        try {
            arrangement.arrange(container, g2, c);
            fail("ควร throw RuntimeException");
        } catch (RuntimeException ex) {
            assertEquals("Not implemented.", ex.getMessage());
        }
    }

    @Test
    public void testArrange_RangeFixed_ThrowsRuntimeException() {
        RectangleConstraint c = new RectangleConstraint(0.0, new Range(10, 50),
                LengthConstraintType.RANGE, 80.0, null, LengthConstraintType.FIXED);
        BlockContainer container = newContainer();
        try {
            arrangement.arrange(container, g2, c);
            fail("ควร throw RuntimeException");
        } catch (RuntimeException ex) {
            assertEquals("Not implemented.", ex.getMessage());
        }
    }

    // =========================================================
    // arrange(): RANGE / RANGE -> arrangeRR
    // =========================================================

    @Test
    public void testArrange_RangeRange_AllBlocksPresent() {
        Block top = new EmptyBlock(TOP_W, TOP_H);
        Block bottom = new EmptyBlock(BOTTOM_W, BOTTOM_H);
        Block left = new EmptyBlock(LEFT_W, LEFT_H);
        Block right = new EmptyBlock(RIGHT_W, RIGHT_H);
        Block center = new EmptyBlock(CENTER_W, CENTER_H);

        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        RectangleConstraint c = new RectangleConstraint(
                new Range(0, 1000), new Range(0, 1000));
        BlockContainer container = newContainer();
        Size2D size = arrangement.arrange(container, g2, c);

        // เนื่องจาก EmptyBlock ไม่สนใจ constraint ผลลัพธ์ width/height
        // จึงตรงกับสูตรเดียวกับ arrangeNN
        assertEquals(270.0, size.getWidth(), 0.0001);
        assertEquals(180.0, size.getHeight(), 0.0001);

        // หมายเหตุ: ใน arrangeRR bounds ของ left/right ใช้ h[2]/h[3] (=60)
        // ไม่ใช่ centerHeight(=150) แบบใน arrangeNN -> เป็น behavior จริงของซอร์สที่ให้มา
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 270.0, 10.0), top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 160.0, 270.0, 20.0), bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 10.0, 30.0, 60.0), left.getBounds());
        assertEquals(new Rectangle2D.Double(230.0, 10.0, 40.0, 60.0), right.getBounds());
        assertEquals(new Rectangle2D.Double(30.0, 10.0, 200.0, 150.0), center.getBounds());
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testAdd_CenterBlock_NullKey | `add()`: `key == null` |
| testAdd_TopBottomLeftRightBlocks | `add()`: edge == TOP/BOTTOM/LEFT/RIGHT ทั้ง 4 เงื่อนไข |
| testAdd_NullBlock_DoesNotThrow_AndTreatedAsAbsent | `add()` รับ block=null; `if (this.topBlock != null)` false path ใน arrangeNN |
| testAdd_InvalidKeyType_ThrowsClassCastException | key ผิดชนิด → ClassCastException (input ผิดรูปแบบ) |
| testEquals_SameInstance | `equals()`: `obj == this` true |
| testEquals_NullObject | `equals()`: `!(obj instanceof BorderArrangement)` (null) |
| testEquals_DifferentClass | `equals()`: instanceof false |
| testEquals_TwoEmptyArrangements | `equals()`: ทุก field null เท่ากัน |
| testEquals_DifferentTopBlock..DifferentCenterBlock | `equals()`: false-return ของแต่ละ field เทียบทีละตัว |
| testEquals_AllFieldsSame | `equals()`: ผ่านทุก field → return true |
| testClear_ResetsAllFields | `clear()` ทุก field ถูก reset + arrangeNN กรณีไม่มี block |
| testArrange_NoneNone_AllBlocksPresent | `arrange()`: w=NONE,h=NONE → arrangeNN ทุก if block!=null true |
| testArrange_NoneNone_OnlyCenterBlock | arrangeNN: top/bottom/left/right = null (false path) |
| testArrange_NoneNone_NoBlocksAtAll | arrangeNN: ทุก block null |
| testArrange_NoneFixed_ThrowsRuntimeException | `arrange()`: w=NONE,h=FIXED → RuntimeException |
| testArrange_NoneRange_ThrowsRuntimeException | `arrange()`: w=NONE,h=RANGE → RuntimeException |
| testArrange_FixedNone_AllBlocksPresent | `arrange()`: w=FIXED,h=NONE → arrangeFN ทุก block present |
| testArrange_FixedNone_BoundaryZeroWidth | boundary: width=0 ใน arrangeFN/arrangeFF |
| testArrange_FixedFixed_AllBlocksPresent | `arrange()`: w=FIXED,h=FIXED → arrangeFF ทุก block |
| testArrange_FixedFixed_NoBlocks | arrangeFF: ทุก if block==null (false path) |
| testArrange_FixedRange_WithinRange | arrangeFR: `heightRange.contains(...)` = true |
| testArrange_FixedRange_OutsideRange | arrangeFR: `heightRange.contains(...)` = false → constrain + recursive arrange |
| testArrange_RangeNone_ThrowsRuntimeException | `arrange()`: w=RANGE,h=NONE → RuntimeException |
| testArrange_RangeFixed_ThrowsRuntimeException | `arrange()`: w=RANGE,h=FIXED → RuntimeException |
| testArrange_RangeRange_AllBlocksPresent | `arrange()`: w=RANGE,h=RANGE → arrangeRR ทุก block present |

**ข้อจำกัดที่ระบุไว้:** branch ของ `add()` ที่ไม่ตรงกับ TOP/BOTTOM/LEFT/RIGHT ใด ๆ (else สุดท้าย ไม่ทำอะไร) ไม่สามารถทดสอบได้ เนื่องจาก `RectangleEdge` มีเพียง 4 instance ที่เป็นไปได้ตามซอร์สที่ให้มา จึงไม่ได้เขียนเทสสำหรับกรณีนี้ (ไม่เดา behavior เพิ่มเติม)