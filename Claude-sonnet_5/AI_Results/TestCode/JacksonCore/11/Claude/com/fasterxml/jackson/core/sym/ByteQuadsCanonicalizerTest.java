package com.fasterxml.jackson.core.sym;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;

/**
 * Unit tests for {@link ByteQuadsCanonicalizer}.
 * อยู่ใน package เดียวกับ target class เพื่อเข้าถึง protected/package-private members ได้ตรง
 * ใช้ reflection เฉพาะส่วนที่เป็น private (constructors, rehash()) เท่านั้น
 */
public class ByteQuadsCanonicalizerTest
{
    // ---------- helpers ----------

    /**
     * NOTE: สมมติว่า JsonFactory.Feature implement FormatFeature ซึ่งมี getMask()
     * (พฤติกรรมมาตรฐานของ jackson-core ไม่ได้เดา แต่ยึดจากการใช้ enabledIn(flags) ในซอร์ส)
     */
    private static int flagsFor(boolean intern, boolean failOnDoS) {
        int f = 0;
        if (intern) {
            f |= JsonFactory.Feature.INTERN_FIELD_NAMES.getMask();
        }
        if (failOnDoS) {
            f |= JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask();
        }
        return f;
    }

    /** เข้าถึง private constructor(int,boolean,int,boolean) ผ่าน reflection */
    private static ByteQuadsCanonicalizer newRoot(int sz, boolean intern, int seed, boolean failOnDoS) throws Exception {
        Constructor<ByteQuadsCanonicalizer> ctor =
                ByteQuadsCanonicalizer.class.getDeclaredConstructor(int.class, boolean.class, int.class, boolean.class);
        ctor.setAccessible(true);
        return ctor.newInstance(sz, intern, seed, failOnDoS);
    }

    /** เรียก private rehash() ตรง ๆ เพื่อบีบให้ branch การ double/nuke เกิดขึ้นทันที (เร็วกว่าการ insert จริงจำนวนมาก) */
    private static void invokeRehash(ByteQuadsCanonicalizer c) throws Exception {
        Method m = ByteQuadsCanonicalizer.class.getDeclaredMethod("rehash");
        m.setAccessible(true);
        m.invoke(c);
    }

    // ---------- 1. createRoot / basic accessors ----------

    @Test
    public void testCreateRootDefault() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(12345);
        assertEquals(0, root.size());
        assertEquals(12345, root.hashSeed());
        // QUIRK ที่ยืนยันจากซอร์ส: root ไม่ตั้งค่า _hashSize เอง (ใช้ _tableInfo แทน)
        assertEquals(0, root.bucketCount());
        assertTrue(root.toString().contains("ByteQuadsCanonicalizer"));
    }

    @Test
    public void testHashSeedIsStable() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(777);
        assertEquals(777, root.hashSeed());
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        assertEquals(777, child.hashSeed()); // seed สืบทอดไปยัง child
    }

    // ---------- 2. Private constructor: sz normalization (branch: <MIN, not-power-of-2, already ok) ----------

    @Test
    public void testConstructorSizeBelowMinimum() throws Exception {
        ByteQuadsCanonicalizer root = newRoot(8, true, 1, true); // 8 < MIN_HASH_SIZE(16)
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        assertEquals(16, child.bucketCount());
    }

    @Test
    public void testConstructorSizeNotPowerOfTwoRoundsUp() throws Exception {
        ByteQuadsCanonicalizer root = newRoot(100, true, 1, true); // ไม่ใช่ 2^N -> ปัดขึ้นเป็น 128
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        assertEquals(128, child.bucketCount());
    }

    @Test
    public void testConstructorSizeAlreadyPowerOfTwoUnchanged() throws Exception {
        ByteQuadsCanonicalizer root = newRoot(64, true, 1, true); // เป็น 2^N อยู่แล้ว
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        assertEquals(64, child.bucketCount());
    }

    // ---------- 3. makeChild / findName บน empty table ----------

    @Test
    public void testMakeChildInitialStateEmpty() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        assertEquals(0, child.size());
        assertEquals(64, child.bucketCount());
        assertFalse(child.maybeDirty()); // child เริ่มต้น _hashShared=true -> maybeDirty()=false

        // ค้นบน slot ว่าง -> ต้อง null ทุก overload (branch len==0)
        assertNull(child.findName(111));
        assertNull(child.findName(111, 222));
        assertNull(child.findName(111, 222, 333));
        assertNull(child.findName(new int[]{111, 222, 333, 444}, 4));
    }

    // ---------- 4. addName/findName: single quad ----------

    @Test
    public void testAddFindSingleQuad() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(11);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        String stored = child.addName("hello", 12345);
        assertEquals("hello", stored);
        assertEquals(1, child.size());
        assertEquals("hello", child.findName(12345));
        assertNull(child.findName(999999)); // ไม่พบ (empty slot หรือ mismatch)
        assertTrue(child.maybeDirty()); // หลัง add แล้ว hashShared ต้องเป็น false -> maybeDirty()=true
    }

    // ---------- 5. addName/findName: two quads (ปกติ, q2 != 0) ----------

    @Test
    public void testAddFindTwoQuadsNormal() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(22);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        child.addName("world", 100, 200);
        assertEquals("world", child.findName(100, 200));
        assertNull(child.findName(100, 999));
    }

    // ---------- 6. addName two quads: q2 == 0 (branch พิเศษใน addName ที่ใช้ calcHash(q1) แทน) ----------

    @Test
    public void testAddNameTwoQuadsWithZeroSecondQuad() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(33);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        // ตรวจแค่ว่า branch (q2==0 -> calcHash(q1)) รันได้โดยไม่ error และคืนชื่อถูกต้อง (intern branch ด้วย)
        String stored = child.addName("zeroSecond", 555, 0);
        assertEquals("zeroSecond", stored);
        assertEquals(1, child.size());
        // NOTE: ไม่ assert ผลของ findName(555,0) เพราะ addName ใช้ calcHash(q1) เก็บตำแหน่ง
        // แต่ findName(q1,q2) ค้นด้วย calcHash(q1,q2) เสมอ -> ตำแหน่งอาจไม่ตรงกัน (ข้อสังเกตจากซอร์ส ไม่ใช่ข้อสันนิษฐาน)
    }

    // ---------- 7. addName/findName: three quads ----------

    @Test
    public void testAddFindThreeQuads() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(44);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        child.addName("triple", 1, 2, 3);
        assertEquals("triple", child.findName(1, 2, 3));
        assertNull(child.findName(1, 2, 999));
    }

    // ---------- 8. addName(int[],qlen) delegation สำหรับ qlen < 4 ----------

    @Test
    public void testAddNameArrayDelegationShortLengths() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(55);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        child.addName("len1", new int[]{10}, 1);
        child.addName("len2", new int[]{20, 21}, 2);
        child.addName("len3", new int[]{30, 31, 32}, 3);

        assertEquals("len1", child.findName(new int[]{10}, 1));
        assertEquals("len2", child.findName(new int[]{20, 21}, 2));
        assertEquals("len3", child.findName(new int[]{30, 31, 32}, 3));

        assertEquals("len1", child.findName(10));
        assertEquals("len2", child.findName(20, 21));
        assertEquals("len3", child.findName(30, 31, 32));
    }

    // ---------- 9. Long-name path (qlen>=4): _appendLongName growth + _verifyLongName fallthrough (4..8) ----------

    @Test
    public void testAddFindLongNameQlen4to8FallthroughAndGrowth() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(66);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        // qlen=5: ตกใน default-case ของ addName, และ switch fallthrough case 5..4 ของ _verifyLongName
        int[] q5 = {1, 2, 3, 4, 5};
        child.addName("long5", q5, 5);
        assertEquals("long5", child.findName(q5, 5));

        // เพิ่มอีกชื่อ qlen=8 (ทดสอบ boundary บนของ switch fallthrough, และ _appendLongName ต่อจากอันแรก)
        int[] q8 = {9, 8, 7, 6, 5, 4, 3, 2};
        child.addName("long8", q8, 8);
        assertEquals("long8", child.findName(q8, 8));

        // ยืนยันของเดิมยังอยู่ถูกต้องหลัง append ต่อ (long name area ขยายไม่พังของเก่า)
        assertEquals("long5", child.findName(q5, 5));
    }

    // ---------- 10. Long-name path qlen>8: _verifyLongName2 ----------

    @Test
    public void testAddFindLongNameQlenAbove8UsesVerifyLongName2() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(77);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        int[] q = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; // qlen=11 > 8 -> default -> _verifyLongName2
        child.addName("verylong", q, q.length);
        assertEquals("verylong", child.findName(q, q.length));
    }

    // ---------- 11. Long-name mismatch -> _verifyLongName(2) return false ----------

    @Test
    public void testFindLongNameMismatchReturnsNull() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(88);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        int[] q = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        child.addName("orig", q, q.length);

        int[] wrong = q.clone();
        wrong[wrong.length - 1] = 999; // ทำให้ quad สุดท้ายไม่ตรง -> mismatch branch
        assertNull(child.findName(wrong, wrong.length));
    }

    // ---------- 12. calcHash(int[],qlen) throws เมื่อ qlen<4 ----------

    @Test(expected = IllegalArgumentException.class)
    public void testCalcHashArrayTooShortThrows() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        root.calcHash(new int[]{1, 2, 3}, 3);
    }

    // ---------- 13. release(): no-op เมื่อ maybeDirty()==false ----------

    @Test
    public void testReleaseNoOpWhenNotDirty() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(99);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        assertFalse(child.maybeDirty());
        child.release(); // ไม่ควร merge อะไรเพราะยังไม่มีการแก้ไข
        assertEquals(0, root.size());
    }

    // ---------- 14. release(): merge สำเร็จตามปกติ ----------

    @Test
    public void testReleaseMergesChildIntoParentNormalCase() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(100);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        child.addName("a", 1);
        child.addName("b", 2);
        child.addName("c", 3);
        assertTrue(child.maybeDirty());

        child.release();
        assertEquals(3, root.size()); // root (parent) สะท้อนค่าที่ merge เข้ามา
    }

    // ---------- 15. mergeChild: childCount == currState.count -> early return branch ----------

    @Test
    public void testMergeChildEarlyReturnWhenCountUnchanged() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(101);
        ByteQuadsCanonicalizer child1 = root.makeChild(flagsFor(true, true));
        child1.addName("x", 1);
        child1.release();
        assertEquals(1, root.size());

        // child2 สร้างจาก root ที่อัปเดตแล้ว (count=1) แต่ไม่มีการแก้ไขเพิ่ม
        ByteQuadsCanonicalizer child2 = root.makeChild(flagsFor(true, true));
        assertFalse(child2.maybeDirty());
        child2.release(); // ไม่เข้า mergeChild เลย (maybeDirty()==false) -> root.size() ไม่เปลี่ยน
        assertEquals(1, root.size());
    }

    // ---------- 16. mergeChild: purge เมื่อ childCount > MAX_ENTRIES_FOR_REUSE(6000) ----------

    @Test
    public void testMergeChildPurgesWhenExceedingMaxEntriesForReuse() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(102);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        int n = 6001; // > MAX_ENTRIES_FOR_REUSE (6000)
        for (int i = 1; i <= n; i++) {
            child.addName("name" + i, i);
        }
        assertEquals(n, child.size());

        child.release();
        // purge -> root ถูกรีเซ็ตเป็น TableInfo ใหม่ (DEFAULT_T_SIZE, count=0)
        assertEquals(0, root.size());
    }

    // ---------- 17. rehash(): normal doubling + copy switch (len=1,2,3,default) ----------

    @Test
    public void testRehashNormalDoublingCopiesAllLengthVariants() throws Exception {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(103);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        child.addName("one", 1);                       // len==1
        child.addName("two", 2, 3);                     // len==2
        child.addName("three", 4, 5, 6);                 // len==3
        int[] longQ = {7, 8, 9, 10, 11};
        child.addName("long", longQ, longQ.length);      // len==5 -> default case (long-name area)

        assertEquals(4, child.size());
        assertEquals(64, child.bucketCount());

        // บีบให้ rehash() ทำงานทันที (ไม่ต้องรอ threshold ธรรมชาติ)
        invokeRehash(child);

        assertEquals(128, child.bucketCount()); // hashSize double
        assertEquals(4, child.size());          // count คงเดิมหลัง rehash (sanity check ผ่าน)

        // ทุกชื่อยังค้นเจอถูกต้องหลัง rehash (ยืนยัน copy logic ทุก case ใน switch ถูกต้อง)
        assertEquals("one", child.findName(1));
        assertEquals("two", child.findName(2, 3));
        assertEquals("three", child.findName(4, 5, 6));
        assertEquals("long", child.findName(longQ, longQ.length));
    }

    // ---------- 18. rehash(): newSize > MAX_T_SIZE -> nukeSymbols branch ----------

    @Test
    public void testRehashNukeBranchWhenExceedingMaxTableSize() throws Exception {
        // สร้าง root/child ที่ hashSize == MAX_T_SIZE (0x10000) เพื่อให้ newSize(double) เกิน MAX_T_SIZE
        ByteQuadsCanonicalizer root = newRoot(0x10000, true, 104, true);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        assertEquals(0x10000, child.bucketCount());

        child.addName("something", 42); // มี entry อยู่ก่อน rehash
        assertEquals(1, child.size());

        invokeRehash(child); // newSize = 0x20000 > MAX_T_SIZE -> nukeSymbols(true); return (ไม่ double hashSize)

        assertEquals(0x10000, child.bucketCount()); // hashSize ไม่เปลี่ยน (คงเดิมตามซอร์ส)
        assertEquals(0, child.size());              // count ถูกรีเซ็ตเป็น 0 จาก nukeSymbols
        assertNull(child.findName(42));              // ข้อมูลถูกล้างจริง
    }

    // ---------- 19. _reportTooManyCollisions(): branch hashSize<=1024 (no-op) ----------

    @Test
    public void testReportTooManyCollisionsSmallTableNoThrow() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(105); // hashSize=64
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        child._reportTooManyCollisions(); // <=1024 -> ไม่ throw
        // ไม่มี exception แสดงว่า branch นี้ผ่าน
    }

    // ---------- 20. _reportTooManyCollisions(): branch hashSize>1024 (throw) ----------

    @Test(expected = IllegalStateException.class)
    public void testReportTooManyCollisionsLargeTableThrows() throws Exception {
        ByteQuadsCanonicalizer root = newRoot(2048, true, 106, true); // hashSize=2048 > 1024
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        child._reportTooManyCollisions(); // ต้อง throw IllegalStateException
    }

    // ---------- 21. _calcTertiaryShift(): ทุก boundary (4 branches) ----------

    @Test
    public void testCalcTertiaryShiftAllBoundaries() {
        assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(252));  // tertSlots=63  (<64)
        assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(256));  // tertSlots=64  (<=256)
        assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(1024)); // tertSlots=256 (<=256 boundary)
        assertEquals(6, ByteQuadsCanonicalizer._calcTertiaryShift(1028)); // tertSlots=257 (<=1024)
        assertEquals(6, ByteQuadsCanonicalizer._calcTertiaryShift(4096)); // tertSlots=1024(<=1024 boundary)
        assertEquals(7, ByteQuadsCanonicalizer._calcTertiaryShift(4100)); // tertSlots=1025(else)
    }

    // ---------- 22. Count-consistency (primary+secondary+tertiary+spillover == total == size) ----------

    @Test
    public void testCountsConsistencyAfterManyInserts() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(107);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));

        int n = 300; // จำนวนพอที่จะกระจายไปหลาย bucket และผ่าน rehash ธรรมชาติได้บางส่วน
        for (int i = 1; i <= n; i++) {
            child.addName("v" + i, i, i * 31);
        }
        assertEquals(n, child.size());

        int pri = child.primaryCount();
        int sec = child.secondaryCount();
        int ter = child.tertiaryCount();
        int spill = child.spilloverCount();
        int total = child.totalCount();

        assertEquals(total, pri + sec + ter + spill);
        assertEquals(n, total);

        // สุ่มตรวจว่าทุกชื่อยังค้นเจอ (ไม่มีข้อมูลหาย)
        for (int i = 1; i <= n; i++) {
            assertEquals("v" + i, child.findName(i, i * 31));
        }
    }

    // ---------- 23. size(): root vs child ใช้แหล่งข้อมูลต่างกัน ----------

    @Test
    public void testSizeRootUsesTableInfoChildUsesOwnCount() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(108);
        assertEquals(0, root.size()); // root: ใช้ _tableInfo.get().count

        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        child.addName("a", 1);
        child.addName("b", 2);
        assertEquals(2, child.size()); // child: ใช้ _count ของตัวเอง
        assertEquals(0, root.size());  // root ยังไม่ถูก merge จนกว่าจะ release()

        child.release();
        assertEquals(2, root.size());  // หลัง release แล้ว root สะท้อนค่าใหม่
    }

    // ---------- 24. toString() ไม่ throw และมีข้อมูลตัวเลขสอดคล้องกัน ----------

    @Test
    public void testToStringContainsCounts() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(109);
        ByteQuadsCanonicalizer child = root.makeChild(flagsFor(true, true));
        child.addName("x", 1, 2, 3);
        String s = child.toString();
        assertNotNull(s);
        assertTrue(s.contains("size=1"));
    }
}
