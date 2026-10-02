package com.fasterxml.jackson.core.sym;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

// import ตามที่กำหนด (แม้อยู่ package เดียวกันแล้วก็ระบุไว้ให้ตรงข้อกำหนด)
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;

public class ByteQuadsCanonicalizerTest
{
    private static final int DEFAULT_BUCKET_COUNT = 64; // ตรงกับ private DEFAULT_T_SIZE ในซอร์ส

    // ---------- helper ----------

    /** สร้าง flags=0 -> ปิด intern และ failOnDoS (อาศัย enabledIn(flags) & 0 == false เสมอ) */
    private static int flagsAllOff() { return 0; }

    /**
     * ค้นหากลุ่มค่า q1 ที่ hash ไปตก bucket (primary index) เดียวกัน โดยใช้ calcHash(q1) จริงของ instance
     * เพื่อบังคับ collision path (primary -> secondary -> tertiary -> spillover) แบบ deterministic
     * (ใช้ seed คงที่เท่านั้นเพื่อผลลัพธ์ทำซ้ำได้)
     */
    private static List<Integer> findCollisionGroup(ByteQuadsCanonicalizer table, int minSize, int searchLimit) {
        Map<Integer, List<Integer>> buckets = new HashMap<Integer, List<Integer>>();
        int mask = table.bucketCount() - 1;
        for (int q1 = 0; q1 < searchLimit; q1++) {
            int hash = table.calcHash(q1);
            int ix = hash & mask;
            List<Integer> list = buckets.get(ix);
            if (list == null) {
                list = new ArrayList<Integer>();
                buckets.put(ix, list);
            }
            list.add(q1);
            if (list.size() >= minSize) {
                return list;
            }
        }
        throw new AssertionError("ไม่พบกลุ่ม collision ขนาด " + minSize + " ภายในช่วงค้นหา " + searchLimit);
    }

    // ==================================================================
    // 1. Factory / accessor พื้นฐาน
    // ==================================================================

    @Test
    public void testCreateRootDefaultSeedIsOddAndNonZero() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        assertNotNull(root);
        // ตามคอมเมนต์ในซอร์ส: seed ต้องไม่เป็น 0 และเป็นเลขคี่ (| 1)
        assertTrue((root.hashSeed() & 1) == 1);
        assertEquals(0, root.size());
        assertEquals(DEFAULT_BUCKET_COUNT, root.bucketCount());
    }

    @Test
    public void testCreateRootWithFixedSeed() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(12345);
        assertEquals(12345, root.hashSeed());
        assertEquals(0, root.size());
        assertEquals(DEFAULT_BUCKET_COUNT, root.bucketCount());
        assertFalse(root.maybeDirty()); // root ยังไม่ผ่าน addName ใด ๆ (แม้ maybeDirty เช็ค _hashShared ของ instance เอง)
    }

    @Test
    public void testMakeChildInheritsSeedAndInitialState() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(5);
        ByteQuadsCanonicalizer child = root.makeChild(flagsAllOff());
        assertEquals(5, child.hashSeed());
        assertEquals(0, child.size());
        assertEquals(DEFAULT_BUCKET_COUNT, child.bucketCount());
        // child เริ่มต้น hashShared = true -> maybeDirty() ต้องเป็น false
        assertFalse(child.maybeDirty());
    }

    // ==================================================================
    // 2. Single-quad add/find (primary hit, empty slot)
    // ==================================================================

    @Test
    public void testFindNameSingleQuad_EmptySlotReturnsNull() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(1).makeChild(flagsAllOff());
        assertNull(child.findName(999)); // len==0 บน primary slot
    }

    @Test
    public void testAddAndFindSingleQuadPrimaryHit() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(1).makeChild(flagsAllOff());
        String stored = child.addName("field1", 42);
        assertEquals("field1", stored);
        assertEquals("field1", child.findName(42));
        assertEquals(1, child.size());
    }

    // ==================================================================
    // 3. Two-quad: contrast case ปกติ vs. "known defect" (q2 == 0)
    // ==================================================================

    @Test
    public void testAddThenFindTwoQuadsNonZeroSecondQuad_Normal() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(777).makeChild(flagsAllOff());
        child.addName("fieldY", 111, 222);
        // ทั้ง addName และ findName ใช้ calcHash(q1,q2) เหมือนกัน (q2 != 0) -> ควรหาเจอปกติ
        assertEquals("fieldY", child.findName(111, 222));
    }

    /**
     * *** ทดสอบดัก fault ที่พบในซอร์ส ***
     * addName(String,int,int): เมื่อ q2==0 จะใช้ calcHash(q1) (hash แบบ single-quad)
     * แต่ findName(int,int) ใช้ calcHash(q1,q2) เสมอ (ไม่เช็คว่า q2==0)
     * ทำให้ตำแหน่งที่บันทึกกับตำแหน่งที่ค้นหาไม่ตรงกัน -> คาดว่า test นี้จะ "ล้มเหลว" บนโค้ดที่มี defect นี้จริง
     */
    @Test
    public void testAddThenFindTwoQuadWithSecondQuadZero_KnownDefect() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(777).makeChild(flagsAllOff());
        String stored = child.addName("fieldX", 12345, 0);
        assertEquals("fieldX", stored);
        // ตามสัญญาของ API ควรค้นหาชื่อที่เพิ่งเพิ่มเจอ
        assertEquals("fieldX", child.findName(12345, 0));
    }

    // ==================================================================
    // 4. Three-quad add/find
    // ==================================================================

    @Test
    public void testAddAndFindThreeQuadsPrimaryHit() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(2).makeChild(flagsAllOff());
        child.addName("f3", 1, 2, 3);
        assertEquals("f3", child.findName(1, 2, 3));
        assertNull(child.findName(1, 2, 999)); // primary len!=0 แต่เนื้อหาไม่ตรง แล้วตกไป secondary(len==0)->null
    }

    // ==================================================================
    // 5. Long-name (qlen >= 4) boundary ของ _verifyLongName / _verifyLongName2
    // ==================================================================

    @Test
    public void testAddAndFindLongName_Qlen4_DefaultBranch() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(3).makeChild(flagsAllOff());
        int[] q = {1, 2, 3, 4};
        child.addName("longName4", q, 4);
        assertEquals("longName4", child.findName(new int[]{1, 2, 3, 4}, 4));
    }

    @Test
    public void testAddAndFindLongName_Qlen8_BoundaryOfSwitchFallThrough() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(4).makeChild(flagsAllOff());
        int[] q = {1, 2, 3, 4, 5, 6, 7, 8};
        child.addName("longName8", q, 8);
        assertEquals("longName8", child.findName(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 8));
    }

    @Test
    public void testAddAndFindLongName_Qlen9_UsesVerifyLongName2() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(5).makeChild(flagsAllOff());
        int[] q = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        child.addName("longName9", q, 9);
        assertEquals("longName9", child.findName(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
    }

    @Test
    public void testFindLongName_MismatchContentReturnsNull() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(6).makeChild(flagsAllOff());
        child.addName("longD", new int[]{1, 2, 3, 4}, 4);
        // เนื้อหาต่างกัน -> คาดว่า hash ต่างกันด้วยตามอัลกอริทึม -> null
        // NOTE: ไม่ได้ target ตรงจุด _verifyLongName คืน false โดยเฉพาะ (ต้องการ hash ชนกันจริง
        // ซึ่งซับซ้อนเกินจะบังคับได้แบบ deterministic จาก public API) จึงเป็นเพียง negative test พื้นฐาน
        assertNull(child.findName(new int[]{1, 2, 3, 999}, 4));
    }

    @Test
    public void testFindNameAllOverloadsReturnNullWhenEmpty() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(7).makeChild(flagsAllOff());
        assertNull(child.findName(1));
        assertNull(child.findName(1, 2));
        assertNull(child.findName(1, 2, 3));
        assertNull(child.findName(new int[]{1, 2, 3, 4}, 4));
    }

    // ==================================================================
    // 6. addName(String,int[],int) dispatch ตาม qlen (1,2,3,default)
    // ==================================================================

    @Test
    public void testAddNameArrayDispatch_Qlen1() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(8).makeChild(flagsAllOff());
        child.addName("a1", new int[]{100}, 1);
        assertEquals("a1", child.findName(100));
    }

    @Test
    public void testAddNameArrayDispatch_Qlen2() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(9).makeChild(flagsAllOff());
        child.addName("a2", new int[]{101, 102}, 2);
        assertEquals("a2", child.findName(101, 102));
    }

    @Test
    public void testAddNameArrayDispatch_Qlen3() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(10).makeChild(flagsAllOff());
        child.addName("a3", new int[]{103, 104, 105}, 3);
        assertEquals("a3", child.findName(103, 104, 105));
    }

    @Test
    public void testAddNameArrayDispatch_QlenDefaultLong() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(11).makeChild(flagsAllOff());
        child.addName("a4", new int[]{1, 2, 3, 4}, 4);
        assertEquals("a4", child.findName(new int[]{1, 2, 3, 4}, 4));
    }

    @Test
    public void testAddNameArrayDispatch_MultipleLongNames_TriggersLongAreaGrowth() {
        // NOTE: TableInfo.createInitial จัดสรร mainHash ขนาดเท่ากับ hashAreaSize พอดี และตั้ง
        // longNameOffset = hashAreaSize (ชี้เลยขอบ array) ดังนั้นการเพิ่ม long-name ครั้งแรก
        // จะ trigger การขยาย array เสมอ (branch true ของ (start+qlen) > _hashArea.length)
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(12).makeChild(flagsAllOff());
        child.addName("long1", new int[]{1, 2, 3, 4}, 4);           // growth branch = true (ครั้งแรก)
        child.addName("long2", new int[]{5, 6, 7, 8, 9}, 5);        // อาจ true/false ขึ้นกับ buffer ที่เหลือ
        assertEquals("long1", child.findName(new int[]{1, 2, 3, 4}, 4));
        assertEquals("long2", child.findName(new int[]{5, 6, 7, 8, 9}, 5));
    }

    // ==================================================================
    // 7. findName(int[],qlen) dispatch ตาม qlen (3,2,else)
    // ==================================================================

    @Test
    public void testFindNameArrayDispatch_Qlen3DelegatesToThreeArgOverload() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(13).makeChild(flagsAllOff());
        child.addName("nameA", 10, 20, 30);
        assertEquals("nameA", child.findName(new int[]{10, 20, 30, 0}, 3));
    }

    @Test
    public void testFindNameArrayDispatch_Qlen2DelegatesToTwoArgOverload() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(14).makeChild(flagsAllOff());
        child.addName("nameB", 40, 50);
        assertEquals("nameB", child.findName(new int[]{40, 50, 999}, 2));
    }

    @Test
    public void testFindNameArrayDispatch_Qlen1ElseBranch() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(15).makeChild(flagsAllOff());
        child.addName("nameC", 70);
        assertEquals("nameC", child.findName(new int[]{70, 888}, 1));
    }

    @Test
    public void testFindNameArrayDispatch_Qlen0StillUsesFirstElement() {
        // qlen ที่ไม่ใช่ 3 หรือ 2 (รวมถึง 0) จะตกไปยัง else -> return findName(q[0])
        // เป็น behavior ที่เห็นตรงในซอร์ส (ไม่ใช่การเดา)
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(16).makeChild(flagsAllOff());
        child.addName("nameC", 70);
        assertEquals("nameC", child.findName(new int[]{70}, 0));
    }

    // ==================================================================
    // 8. calcHash: deterministic + boundary qlen<4 -> exception
    // ==================================================================

    @Test
    public void testCalcHashSingleIsDeterministic() {
        ByteQuadsCanonicalizer c = ByteQuadsCanonicalizer.createRoot(17).makeChild(flagsAllOff());
        assertEquals(c.calcHash(555), c.calcHash(555));
    }

    @Test
    public void testCalcHashTwoIsDeterministic() {
        ByteQuadsCanonicalizer c = ByteQuadsCanonicalizer.createRoot(18).makeChild(flagsAllOff());
        assertEquals(c.calcHash(1, 2), c.calcHash(1, 2));
    }

    @Test
    public void testCalcHashThreeIsDeterministic() {
        ByteQuadsCanonicalizer c = ByteQuadsCanonicalizer.createRoot(19).makeChild(flagsAllOff());
        assertEquals(c.calcHash(1, 2, 3), c.calcHash(1, 2, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHashArray_QlenBelowFour_Throws() {
        ByteQuadsCanonicalizer c = ByteQuadsCanonicalizer.createRoot(20).makeChild(flagsAllOff());
        c.calcHash(new int[]{1, 2, 3}, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHashArray_QlenZero_Throws() {
        ByteQuadsCanonicalizer c = ByteQuadsCanonicalizer.createRoot(21).makeChild(flagsAllOff());
        c.calcHash(new int[0], 0);
    }

    @Test
    public void testCalcHashArray_Qlen4Boundary_Deterministic() {
        ByteQuadsCanonicalizer c = ByteQuadsCanonicalizer.createRoot(22).makeChild(flagsAllOff());
        int[] q = {1, 2, 3, 4};
        assertEquals(c.calcHash(q, 4), c.calcHash(q, 4));
    }

    @Test
    public void testCalcHashArray_LongerQlen_Deterministic() {
        ByteQuadsCanonicalizer c = ByteQuadsCanonicalizer.createRoot(23).makeChild(flagsAllOff());
        int[] q = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(c.calcHash(q, 10), c.calcHash(q, 10));
    }

    // ==================================================================
    // 9. Collision path เต็ม: primary -> secondary -> tertiary(full) -> spillover(2 รายการ)
    // ==================================================================

    @Test
    public void testFindAndAddCollisionFullPathSingleQuad() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(999).makeChild(flagsAllOff());

        int tertiaryShift = ByteQuadsCanonicalizer._calcTertiaryShift(child.bucketCount());
        int bucketSize = 1 << tertiaryShift; // ขนาด bucket ของ tertiary ตามซอร์ส

        // ต้องการ: 1 primary + 1 secondary + bucketSize tertiary (เต็ม) + 2 spillover
        int minSize = 2 + bucketSize + 2;
        List<Integer> group = findCollisionGroup(child, minSize, 20000);

        // --- index 0: primary ---
        assertNull(child.findName(group.get(0)));
        child.addName("n0", group.get(0));
        assertEquals("n0", child.findName(group.get(0)));

        // --- index 1: secondary (primary ถูกครอบครองแล้ว แต่ไม่ตรง) ---
        assertNull(child.findName(group.get(1)));
        child.addName("n1", group.get(1));
        assertEquals("n1", child.findName(group.get(1)));

        // --- index 2..(1+bucketSize): เติม tertiary bucket ให้เต็ม ---
        for (int i = 2; i < 2 + bucketSize; i++) {
            int val = group.get(i);
            assertNull("ก่อนเพิ่ม index " + i + " ต้องยังไม่พบ", child.findName(val));
            child.addName("n" + i, val);
            assertEquals("n" + i, child.findName(val));
        }

        // --- spillover ตัวแรก (tertiary เต็มแล้ว) ---
        int spill1Index = 2 + bucketSize;
        int spill1Val = group.get(spill1Index);
        assertNull(child.findName(spill1Val));
        child.addName("n" + spill1Index, spill1Val);
        assertEquals("n" + spill1Index, child.findName(spill1Val));

        // --- spillover ตัวที่สอง (ทดสอบ loop สแกนหลายรายการใน spillover) ---
        int spill2Index = spill1Index + 1;
        int spill2Val = group.get(spill2Index);
        assertNull(child.findName(spill2Val));
        child.addName("n" + spill2Index, spill2Val);
        assertEquals("n" + spill2Index, child.findName(spill2Val));
        // ของเดิมใน spillover ตัวแรกต้องยังหาเจอ (ยืนยัน loop เดินผ่านได้ถูกต้อง)
        assertEquals("n" + spill1Index, child.findName(spill1Val));

        // --- ตรวจ counters ---
        assertEquals(1, child.primaryCount());
        assertEquals(1, child.secondaryCount());
        assertEquals(bucketSize, child.tertiaryCount());
        assertEquals(2, child.spilloverCount());
        assertEquals(minSize, child.totalCount());
        assertEquals(minSize, child.size());
    }

    // ==================================================================
    // 10. rehash() เมื่อเพิ่มจำนวนมาก
    // ==================================================================

    @Test
    public void testRehashTriggeredByManyAdditionsPreservesLookup() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(2024).makeChild(flagsAllOff());
        int n = 80; // เกิน 80% ของ bucketCount เริ่มต้น (64) แน่นอน -> ทำให้เกิด rehash อย่างน้อย 1 ครั้ง
        for (int i = 0; i < n; i++) {
            switch (i % 4) {
                case 0: child.addName("s" + i, i); break;
                case 1: child.addName("s" + i, i, i + 1); break;
                case 2: child.addName("s" + i, i, i + 1, i + 2); break;
                default: child.addName("s" + i, new int[]{i, i + 1, i + 2, i + 3}, 4); break;
            }
        }
        assertTrue("คาดว่า bucketCount ต้องขยายขึ้นจาก 64", child.bucketCount() > DEFAULT_BUCKET_COUNT);
        assertEquals(n, child.size());
        for (int i = 0; i < n; i++) {
            String expected = "s" + i;
            String found;
            switch (i % 4) {
                case 0: found = child.findName(i); break;
                case 1: found = child.findName(i, i + 1); break;
                case 2: found = child.findName(i, i + 1, i + 2); break;
                default: found = child.findName(new int[]{i, i + 1, i + 2, i + 3}, 4); break;
            }
            assertEquals("รายการ index " + i + " ต้องหาเจอหลัง rehash", expected, found);
        }
    }

    // ==================================================================
    // 11. release() / mergeChild()
    // ==================================================================

    @Test
    public void testReleaseNoChangeWhenChildUntouched() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(30);
        ByteQuadsCanonicalizer child = root.makeChild(flagsAllOff());
        child.release(); // maybeDirty() == false เพราะยังไม่ addName -> ไม่ merge
        assertEquals(0, root.size());
    }

    @Test
    public void testReleaseMergesChangesIntoParentAndVisibleToNewChild() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(31);
        ByteQuadsCanonicalizer child = root.makeChild(flagsAllOff());
        child.addName("a", 111);
        assertTrue(child.maybeDirty());
        child.release();
        assertEquals(1, root.size());

        ByteQuadsCanonicalizer child2 = root.makeChild(flagsAllOff());
        assertEquals(1, child2.size());
        assertEquals("a", child2.findName(111));
    }

    @Test
    public void testReleaseWithCountAboveReuseThresholdResetsRootTable() {
        // NOTE: การทดสอบนี้เพิ่มรายการเกิน MAX_ENTRIES_FOR_REUSE (6000) จริง เพื่อ trigger branch
        // childCount > MAX_ENTRIES_FOR_REUSE ใน mergeChild(); อาจใช้เวลาเล็กน้อยแต่ยังอยู่ในระดับวินาที
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(32);
        ByteQuadsCanonicalizer child = root.makeChild(flagsAllOff());
        int total = ByteQuadsCanonicalizer.MAX_ENTRIES_FOR_REUSE + 1;
        for (int i = 0; i < total; i++) {
            child.addName("x" + i, i);
        }
        assertEquals(total, child.size());
        child.release();
        // ตามซอร์ส: ถ้า childCount > MAX_ENTRIES_FOR_REUSE จะแทนที่ด้วย TableInfo ใหม่ (count=0)
        assertEquals(0, root.size());
    }

    /*
     * NOTE: mergeChild() มี branch "if (childCount == currState.count) return;"
     * ซึ่งในทางปฏิบัติไม่สามารถ trigger ผ่าน public API ได้ เพราะ addName() เพิ่ม _count เสมอ
     * ทุกครั้งที่ verifySharing ทำให้ _hashShared=false (เงื่อนไขก่อน mergeChild ถูกเรียก)
     * ดังนั้นจึงไม่ได้เขียนเทสเฉพาะสำหรับ branch นี้ (ไม่เดา behavior เพิ่มเติม)
     */

    // ==================================================================
    // 12. _reportTooManyCollisions()
    // ==================================================================

    @Test
    public void testReportTooManyCollisionsSmallTableDoesNotThrow() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(33).makeChild(flagsAllOff());
        assertTrue(child.bucketCount() <= 1024);
        child._reportTooManyCollisions(); // ต้อง "ไม่" throw (branch early-return)
    }

    @Test(expected = IllegalStateException.class)
    public void testReportTooManyCollisionsLargeTableThrows() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(34).makeChild(flagsAllOff());
        // บังคับให้ bucketCount ขยายเกิน 1024 ผ่าน rehash ปกติ (public API)
        for (int i = 0; i < 6000 && child.bucketCount() <= 1024; i++) {
            child.addName("y" + i, i, i + 1, i + 2);
        }
        assertTrue(child.bucketCount() > 1024);
        child._reportTooManyCollisions(); // ต้อง throw
    }

    // ==================================================================
    // 13. toString()
    // ==================================================================

    @Test
    public void testToStringMatchesExpectedFormat() {
        ByteQuadsCanonicalizer child = ByteQuadsCanonicalizer.createRoot(35).makeChild(flagsAllOff());
        child.addName("z1", 1);
        child.addName("z2", 2, 3);

        int pri = child.primaryCount();
        int sec = child.secondaryCount();
        int tert = child.tertiaryCount();
        int spill = child.spilloverCount();
        int total = child.totalCount();

        String expected = String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]",
                child.getClass().getName(), child.size(), child.bucketCount(),
                pri, sec, tert, spill, total, (pri + sec + tert + spill), total);

        assertEquals(expected, child.toString());
    }
}
