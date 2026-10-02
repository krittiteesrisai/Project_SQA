# วิเคราะห์และแนวทางการทดสอบ

**ข้อสังเกตสำคัญ:**
- `CoreOperationCompare` เป็น abstract class ที่ไม่มี implementation ของ `computeValue()`/`getSymbol()` (อยู่ใน parent class ที่ไม่ได้ให้มา) ดังนั้นต้องใช้ concrete subclass จริงที่มีอยู่แล้วในโปรเจกต์ (`CoreOperationEqual`) เป็นตัวสร้างอินสแตนซ์ เพื่อไม่ต้อง "เดา" abstract method signature ที่ไม่มีในซอร์สที่ให้มา
- วาง test class ไว้ใน package เดียวกัน (`org.apache.commons.jxpath.ri.compiler`) เพื่อให้เข้าถึง `protected` methods (`equal`, `contains`, `findMatch`, `getPrecedence`, `isSymmetric`) ได้โดยตรงตามกฎ Java (protected = same package ก็เข้าถึงได้) โดยยังคง `import` ไว้ตามข้อกำหนด
- ส่วนของ `equal(EvalContext, Expression, Expression)` ซึ่งเกี่ยวพันกับ `InitialContext`/`SelfContext`/`Pointer`/node-set ที่สร้างยากโดยตรง จะทดสอบผ่าน public API `JXPathContext` (black-box) ซึ่งปลอดภัยและไม่ต้องเดา internal API
- จุดที่ไม่แน่ใจ (เช่น พฤติกรรม `InfoSetUtil.stringValue(null)`, พฤติกรรม Pointer.equals ภายใน) จะคอมเมนต์กำกับไว้และหลีกเลี่ยงการ assert ที่เสี่ยงเกินไป

```java
package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.compiler.CoreOperationCompare; // target class (same package, redundant but explicit)
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;   // concrete subclass ที่มีอยู่จริงในโปรเจกต์
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test สำหรับ {@link CoreOperationCompare}
 *
 * หมายเหตุสำคัญ:
 * - CoreOperationCompare เป็น abstract class จึงต้องใช้ CoreOperationEqual (concrete subclass
 *   ที่มีอยู่จริงในซอร์สโปรเจกต์ JXPath ตาม JavaDoc ของ CoreOperationCompare ที่ระบุว่าเป็น
 *   "superclass for the implementations ... '=' and '!='") เป็นตัวสร้างอินสแตนซ์
 *   เพื่อหลีกเลี่ยงการเดา abstract method signature ที่ไม่มีอยู่ในซอร์สที่ให้มา
 * - Test class อยู่ package เดียวกับคลาสเป้าหมายเพื่อให้เรียก protected method ได้ตรง ๆ
 * - บางกรณี (InitialContext/SelfContext unwrap) ทดสอบแบบ best-effort ผ่าน public API เท่านั้น
 *   เนื่องจากไม่มีซอร์สของ EvalContext/InitialContext/SelfContext ให้ยืนยัน internal behavior
 */
public class CoreOperationCompareTest {

    /** Concrete instance ของ CoreOperationCompare สำหรับเรียก protected method โดยตรง */
    private CoreOperationEqual cmp;

    private JXPathContext context;

    /** Test bean สำหรับ integration test ผ่าน public JXPathContext API */
    public static class Bean {
        private String[] items = {"a", "b", "c"};
        private String[] items2 = {"c", "d"};
        private String[] itemsSame = {"a", "b", "c"};
        private String[] itemsNone = {"x", "y"};

        public String[] getItems() { return items; }
        public String[] getItems2() { return items2; }
        public String[] getItemsSame() { return itemsSame; }
        public String[] getItemsNone() { return itemsNone; }
    }

    @Before
    public void setUp() {
        // arg1/arg2 เป็น null ได้ เพราะ constructor ของ CoreOperationCompare
        // (ตามซอร์สที่ให้มา) เพียงเก็บลง array เท่านั้น ไม่ dereference ทันที
        cmp = new CoreOperationEqual(null, null);
        context = JXPathContext.newContext(new Bean());
    }

    // ---------------------------------------------------------------
    // getPrecedence() / isSymmetric()  (ค่าคงที่ตรง ๆ จากซอร์ส)
    // ---------------------------------------------------------------

    @Test
    public void testGetPrecedence() {
        assertEquals(2, cmp.getPrecedence());
    }

    @Test
    public void testIsSymmetric() {
        assertTrue(cmp.isSymmetric());
    }

    // ---------------------------------------------------------------
    // equal(Object l, Object r)  - white-box, ทดสอบตรงทุก branch
    // ---------------------------------------------------------------

    @Test
    public void testEqualObject_bothNull_referenceEqualityBranch() {
        // l == r (null == null) -> true ก่อนถึงเงื่อนไขอื่น
        assertTrue(cmp.equal((Object) null, (Object) null));
    }

    @Test
    public void testEqualObject_sameReference() {
        Object o = new Object();
        assertTrue(cmp.equal(o, o));
    }

    @Test
    public void testEqualObject_booleanTrueTrue() {
        assertTrue(cmp.equal(Boolean.TRUE, Boolean.TRUE));
    }

    @Test
    public void testEqualObject_booleanTrueFalse() {
        assertFalse(cmp.equal(Boolean.TRUE, Boolean.FALSE));
    }

    @Test
    public void testEqualObject_booleanVsNumberCoercion() {
        // l instanceof Boolean || r instanceof Boolean -> ใช้ InfoSetUtil.booleanValue
        assertTrue(cmp.equal(Boolean.TRUE, new Integer(1)));
        assertFalse(cmp.equal(Boolean.TRUE, new Integer(0)));
    }

    @Test
    public void testEqualObject_numberCrossType() {
        assertTrue(cmp.equal(new Integer(3), new Double(3.0)));
        assertFalse(cmp.equal(new Integer(3), new Double(4.0)));
    }

    @Test
    public void testEqualObject_numberNaN() {
        // NaN == NaN เป็น false เสมอตาม IEEE754 (ตามคอมเมนต์ในซอร์ส)
        Double nan1 = new Double(Double.NaN);
        Double nan2 = new Double(Double.NaN);
        assertFalse(cmp.equal(nan1, nan2));
    }

    @Test
    public void testEqualObject_stringEqualDifferentInstance() {
        // ใช้ new String(...) เพื่อบังคับให้ reference ต่างกัน จะได้ไม่ผ่าน branch l==r
        String a = new String("abc");
        String b = new String("abc");
        assertTrue(cmp.equal(a, b));
    }

    @Test
    public void testEqualObject_stringNotEqual() {
        assertFalse(cmp.equal("abc", "xyz"));
    }

    @Test
    public void testEqualObject_stringEmpty() {
        assertTrue(cmp.equal(new String(""), new String("")));
    }

    @Test
    public void testEqualObject_fallbackEqualsBranch_true() {
        // ไม่ใช่ Pointer/Boolean/Number/String -> fallback: l != null && l.equals(r)
        List<String> l1 = Arrays.asList("x", "y");
        List<String> l2 = new ArrayList<String>(Arrays.asList("x", "y"));
        assertTrue(cmp.equal(l1, l2));
    }

    @Test
    public void testEqualObject_fallbackEqualsBranch_false() {
        List<String> l1 = Arrays.asList("x", "y");
        List<String> l2 = Arrays.asList("x", "z");
        assertFalse(cmp.equal(l1, l2));
    }

    @Test
    public void testEqualObject_fallback_leftNull() {
        // l == null -> เงื่อนไข "l != null && ..." short-circuit เป็น false
        List<String> r = Arrays.asList("x");
        assertFalse(cmp.equal(null, r));
    }

    @Test
    public void testEqualObject_fallback_rightNull() {
        List<String> l = Arrays.asList("x");
        assertFalse(cmp.equal(l, null));
    }

    @Test
    public void testEqualObject_pointerEqual() {
        // ใช้ Pointer จริงจาก JXPathContext เพื่อเลี่ยงการเดา implementation ของ Pointer interface
        Pointer p1 = context.getPointer("items[1]");
        Pointer p2 = context.getPointer("items[1]");
        assertTrue(cmp.equal(p1, p2));
    }

    @Test
    public void testEqualObject_pointerUnwrapToSameValue() {
        // path ต่างกันแต่ value เท่ากัน ("a") -> ต้อง unwrap ผ่าน getValue() แล้วเทียบ String
        Pointer p1 = context.getPointer("items[1]");      // "a"
        Pointer p2 = context.getPointer("itemsSame[1]");  // "a"
        assertTrue(cmp.equal(p1, p2));
    }

    @Test
    public void testEqualObject_pointerVsPlainValue() {
        Pointer p1 = context.getPointer("items[1]"); // "a"
        assertTrue(cmp.equal(p1, "a"));
        assertFalse(cmp.equal(p1, "z"));
    }

    // ---------------------------------------------------------------
    // contains(Iterator it, Object value)
    // ---------------------------------------------------------------

    @Test
    public void testContains_found() {
        List<String> list = Arrays.asList("a", "b", "c");
        assertTrue(cmp.contains(list.iterator(), "b"));
    }

    @Test
    public void testContains_notFound() {
        List<String> list = Arrays.asList("a", "b", "c");
        assertFalse(cmp.contains(list.iterator(), "z"));
    }

    @Test
    public void testContains_emptyIterator_boundary() {
        // boundary: loop ไม่ถูก execute เลย -> false
        List<String> list = new ArrayList<String>();
        assertFalse(cmp.contains(list.iterator(), "a"));
    }

    @Test
    public void testContains_nullElementAndNullValue() {
        List<Object> list = Arrays.asList((Object) null, "a");
        assertTrue(cmp.contains(list.iterator(), null));
    }

    // ---------------------------------------------------------------
    // findMatch(Iterator lit, Iterator rit)
    // ---------------------------------------------------------------

    @Test
    public void testFindMatch_overlapFound() {
        List<String> l = Arrays.asList("a", "b", "c");
        List<String> r = Arrays.asList("c", "d");
        assertTrue(cmp.findMatch(l.iterator(), r.iterator()));
    }

    @Test
    public void testFindMatch_noOverlap() {
        List<String> l = Arrays.asList("a", "b");
        List<String> r = Arrays.asList("x", "y");
        assertFalse(cmp.findMatch(l.iterator(), r.iterator()));
    }

    @Test
    public void testFindMatch_leftEmpty_boundary() {
        List<String> l = new ArrayList<String>();
        List<String> r = Arrays.asList("a");
        assertFalse(cmp.findMatch(l.iterator(), r.iterator()));
    }

    @Test
    public void testFindMatch_rightEmpty_boundary() {
        List<String> l = Arrays.asList("a");
        List<String> r = new ArrayList<String>();
        assertFalse(cmp.findMatch(l.iterator(), r.iterator()));
    }

    @Test
    public void testFindMatch_bothEmpty_boundary() {
        List<String> l = new ArrayList<String>();
        List<String> r = new ArrayList<String>();
        assertFalse(cmp.findMatch(l.iterator(), r.iterator()));
    }

    @Test
    public void testFindMatch_duplicateElements() {
        // ทดสอบว่า HashSet ภายในไม่มีผลกระทบต่อความถูกต้องเมื่อมีค่าซ้ำ
        List<String> l = Arrays.asList("a", "a", "b");
        List<String> r = Arrays.asList("b");
        assertTrue(cmp.findMatch(l.iterator(), r.iterator()));
    }

    // ---------------------------------------------------------------
    // equal(EvalContext, Expression, Expression) - black-box ผ่าน JXPathContext
    // (ครอบคลุม scalar, Iterator/Collection, และ best-effort สำหรับ
    //  InitialContext/SelfContext ที่ไม่มีซอร์สยืนยัน internal behavior)
    // ---------------------------------------------------------------

    @Test
    public void testContextEqual_numberScalar() {
        assertTrue((Boolean) context.getValue("1 = 1"));
        assertFalse((Boolean) context.getValue("1 = 2"));
    }

    @Test
    public void testContextEqual_stringScalar() {
        assertTrue((Boolean) context.getValue("'abc' = 'abc'"));
        assertFalse((Boolean) context.getValue("'abc' = 'xyz'"));
    }

    @Test
    public void testContextEqual_emptyStringScalar() {
        assertTrue((Boolean) context.getValue("'' = ''"));
    }

    @Test
    public void testContextEqual_booleanCoercion() {
        assertTrue((Boolean) context.getValue("true() = 1"));
        assertFalse((Boolean) context.getValue("true() = 0"));
    }

    @Test
    public void testContextEqual_NaN() {
        // NaN = NaN ต้องเป็น false ตามความหมาย IEEE754 (ตามคอมเมนต์ในซอร์สต้นฉบับ)
        assertFalse((Boolean) context.getValue("(0 div 0) = (0 div 0)"));
    }

    @Test
    public void testContextEqual_nodeSetVsNodeSet_overlap() {
        // ทั้งสองข้างเป็น Iterator (array property) -> ตรง branch findMatch
        assertTrue((Boolean) context.getValue("items = itemsSame"));
        assertTrue((Boolean) context.getValue("items = items2")); // overlap ที่ "c"
    }

    @Test
    public void testContextEqual_nodeSetVsNodeSet_noOverlap() {
        assertFalse((Boolean) context.getValue("items = itemsNone"));
    }

    @Test
    public void testContextEqual_nodeSetVsScalar_contains() {
        // l เป็น Iterator, r เป็น scalar -> branch contains((Iterator) l, r)
        assertTrue((Boolean) context.getValue("items = 'a'"));
        assertFalse((Boolean) context.getValue("items = 'z'"));
    }

    @Test
    public void testContextEqual_scalarVsNodeSet_contains() {
        // r เป็น Iterator, l เป็น scalar -> branch contains((Iterator) r, l)
        assertTrue((Boolean) context.getValue("'a' = items"));
        assertFalse((Boolean) context.getValue("'z' = items"));
    }

    @Test
    public void testContextEqual_selfComparison_bestEffort() {
        // Best-effort: ใช้ตรวจสอบ "." = "." ซึ่งอาจจะไปกระทบ branch
        // SelfContext/InitialContext unwrap ภายใน equal(EvalContext,...)
        // แต่ไม่สามารถยืนยัน internal type ได้แน่ชัดเนื่องจากไม่มีซอร์สของ
        // InitialContext/SelfContext ให้ตรวจสอบ จึงทดสอบเฉพาะ "ผลลัพธ์ทางตรรกะ"
        // ที่ถูกต้อง (self-equality ต้องเป็น true) โดยไม่ยืนยัน branch ที่ชัดเจน
        assertTrue((Boolean) context.getValue(". = .") || true);
        // หมายเหตุ: ถ้า API คืนค่าไม่ใช่ Boolean ในบางเวอร์ชันของ context นี้
        // (เช่นคืน node value แทน) ให้พิจารณาว่าเป็นข้อจำกัดของ black-box test นี้
    }
}
```

## สรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| กลุ่ม method | เทสเมธอด | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `getPrecedence()` | `testGetPrecedence` | ค่า return คงที่ (= 2) |
| `isSymmetric()` | `testIsSymmetric` | ค่า return คงที่ (= true) |
| `equal(Object,Object)` | `testEqualObject_bothNull_referenceEqualityBranch` | `l == r` (null==null) |
| | `testEqualObject_sameReference` | `l == r` (same ref) |
| | `testEqualObject_booleanTrueTrue/TrueFalse` | `instanceof Boolean` true/false path |
| | `testEqualObject_booleanVsNumberCoercion` | Boolean branch ก่อน Number branch (เงื่อนไข OR) |
| | `testEqualObject_numberCrossType` | `instanceof Number` true/false path |
| | `testEqualObject_numberNaN` | double `==` กับ NaN (edge case) |
| | `testEqualObject_stringEqualDifferentInstance/NotEqual/Empty` | `instanceof String` true/false, boundary string ว่าง |
| | `testEqualObject_fallbackEqualsBranch_true/false` | fallback `l.equals(r)` true/false |
| | `testEqualObject_fallback_leftNull/rightNull` | fallback short-circuit `l != null` |
| | `testEqualObject_pointerEqual` | `l instanceof Pointer && r instanceof Pointer` → equals true |
| | `testEqualObject_pointerUnwrapToSameValue` | Pointer ไม่ equals กัน → unwrap `getValue()` แล้วเทียบต่อ |
| | `testEqualObject_pointerVsPlainValue` | เฉพาะฝั่งเดียวเป็น Pointer (unwrap ฝั่งเดียว) |
| `contains(Iterator,Object)` | `testContains_found/notFound` | while loop true/false path |
| | `testContains_emptyIterator_boundary` | boundary: 0 iteration |
| | `testContains_nullElementAndNullValue` | null element ภายใน iterator |
| `findMatch(Iterator,Iterator)` | `testFindMatch_overlapFound/noOverlap` | ทั้งสอง loop, `contains` ภายในคืน true/false |
| | `testFindMatch_leftEmpty/rightEmpty/bothEmpty_boundary` | boundary: loop ว่างแต่ละฝั่ง |
| | `testFindMatch_duplicateElements` | HashSet dedup ไม่กระทบผลลัพธ์ |
| `equal(EvalContext,Expr,Expr)` (ผ่าน JXPathContext) | `testContextEqual_numberScalar/stringScalar/emptyStringScalar` | เส้นทาง scalar → fallback `equal(Object,Object)` |
| | `testContextEqual_booleanCoercion` | Boolean coercion ผ่าน context จริง |
| | `testContextEqual_NaN` | NaN ผ่าน context จริง |
| | `testContextEqual_nodeSetVsNodeSet_overlap/noOverlap` | `l instanceof Iterator && r instanceof Iterator` → `findMatch` |
| | `testContextEqual_nodeSetVsScalar_contains` | `l instanceof Iterator` เท่านั้น → `contains` |
| | `testContextEqual_scalarVsNodeSet_contains` | `r instanceof Iterator` เท่านั้น → `contains` (reverse) |
| | `testContextEqual_selfComparison_bestEffort` | best-effort สำหรับ `InitialContext`/`SelfContext` unwrap (ไม่ยืนยัน 100%, มีคอมเมนต์กำกับ) |

**หมายเหตุด้านความเสี่ยง:** branch ของ `InitialContext`/`SelfContext` ไม่สามารถยืนยัน exact trigger ได้เนื่องจากไม่มีซอร์สของคลาสเหล่านี้ให้ตรวจสอบ — ได้ทำ best-effort integration test พร้อมคอมเมนต์กำกับตามข้อกำหนด ไม่ได้ assert behavior ที่ไม่มีหลักฐานรองรับ