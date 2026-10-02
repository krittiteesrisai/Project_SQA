# วิเคราะห์คลาสเป้าหมาย

`CoreOperationNotEqual` มีโค้ดที่ทดสอบได้โดยตรง 2 จุดหลัก:

1. **`computeValue(EvalContext)`** — มี branch เดียวคือ ternary:
   `equal(...) ? Boolean.FALSE : Boolean.TRUE`
   ต้องทดสอบทั้งกรณี `equal == true` (ผลลัพธ์ `FALSE`) และ `equal == false` (ผลลัพธ์ `TRUE`)

2. **`getSymbol()`** — ค่าคงที่ `"!="` ต้องตรวจสอบ

3. **Constructor** — รับ `Expression arg1, arg2` ส่งต่อให้ `super()` (ไม่มี validation) — ทดสอบ edge case ส่ง `null`

เนื่องจาก `equal()` เป็น method ที่ถูก inherited มาจาก `CoreOperationCompare` ซึ่ง**ไม่มี source ให้ตรวจสอบ** ผมจึงเลือกทดสอบผ่าน public API (`JXPathContext`) โดยใช้ความรู้จาก **มาตรฐาน XPath 1.0 spec** (ไม่ใช่การเดา internal implementation) เพื่อกระตุ้นให้ `equal()` คืนค่า `true`/`false` ในสถานการณ์ต่าง ๆ — รวมถึงกรณี node-set ซึ่งน่าจะมี loop อยู่ภายใน `equal()` (จึงอนุมานว่าเป็นการกระตุ้น loop ทางอ้อม) โดยคอมเมนต์กำกับจุดที่ไม่มั่นใจ 100% ไว้ชัดเจน

```java
package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.*;

import org.apache.commons.jxpath.JXPathContext;
import org.jdom.Document;
import org.jdom.Element;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for {@link CoreOperationNotEqual}.
 *
 * หมายเหตุ: equal() เป็น method ที่ inherited มาจาก CoreOperationCompare
 * ซึ่งไม่มี source code ให้ดู ดังนั้นการทดสอบ computeValue() จะใช้
 * JXPathContext (public API) ประเมิน XPath expression จริง โดยอิงผลลัพธ์
 * ตามมาตรฐาน XPath 1.0 spec เพื่อกระตุ้นทั้งสอง branch ของ ternary
 * ภายใน computeValue() (equal == true / equal == false)
 */
public class CoreOperationNotEqualTest {

    private JXPathContext context;

    @Before
    public void setUp() {
        context = JXPathContext.newContext(new Object());
    }

    // ---------------------------------------------------------------
    // getSymbol()
    // ---------------------------------------------------------------

    @Test
    public void testGetSymbol_ReturnsNotEqualSymbol() {
        CoreOperationNotEqual op =
            new CoreOperationNotEqual(new Constant("a"), new Constant("a"));
        assertEquals("!=", op.getSymbol());
    }

    @Test
    public void testGetSymbol_DoesNotDependOnArgs_EvenIfNull() {
        // Boundary/edge case: constructor ไม่ validate args -> ส่ง null ได้
        // getSymbol() ไม่แตะ args จึงไม่ควร throw exception
        CoreOperationNotEqual op = new CoreOperationNotEqual(null, null);
        assertEquals("!=", op.getSymbol());
    }

    // ---------------------------------------------------------------
    // computeValue() - scalar: numbers
    // ---------------------------------------------------------------

    @Test
    public void testComputeValue_NumbersEqual_ReturnsFalse() {
        Object result = context.getValue("1 != 1");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_NumbersNotEqual_ReturnsTrue() {
        Object result = context.getValue("1 != 2");
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_ZeroEqualsZero_ReturnsFalse() {
        // boundary value: 0
        Object result = context.getValue("0 != 0");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_NegativeVsPositive_ReturnsTrue() {
        Object result = context.getValue("-1 != 1");
        assertEquals(Boolean.TRUE, result);
    }

    // ---------------------------------------------------------------
    // computeValue() - scalar: strings
    // ---------------------------------------------------------------

    @Test
    public void testComputeValue_StringsEqual_ReturnsFalse() {
        Object result = context.getValue("'abc' != 'abc'");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_StringsNotEqual_ReturnsTrue() {
        Object result = context.getValue("'abc' != 'xyz'");
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_EmptyStringVsEmptyString_ReturnsFalse() {
        // boundary: empty string
        Object result = context.getValue("'' != ''");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_EmptyStringVsNonEmpty_ReturnsTrue() {
        Object result = context.getValue("'' != 'x'");
        assertEquals(Boolean.TRUE, result);
    }

    // ---------------------------------------------------------------
    // computeValue() - scalar: booleans
    // ---------------------------------------------------------------

    @Test
    public void testComputeValue_BooleansEqual_ReturnsFalse() {
        Object result = context.getValue("true() != true()");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_BooleansNotEqual_ReturnsTrue() {
        Object result = context.getValue("true() != false()");
        assertEquals(Boolean.TRUE, result);
    }

    // ---------------------------------------------------------------
    // computeValue() - type coercion boundary (number vs string)
    // ---------------------------------------------------------------

    @Test
    public void testComputeValue_NumberVsNumericString_ReturnsFalse() {
        // ตาม XPath spec: เมื่อเทียบ number กับ string จะแปลง string เป็น number
        Object result = context.getValue("1 != '1'");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_NumberVsEmptyString_ReturnsTrue() {
        // '' แปลงเป็น number จะได้ NaN ซึ่งไม่เท่ากับ 0 เสมอ
        Object result = context.getValue("0 != ''");
        assertEquals(Boolean.TRUE, result);
    }

    // ---------------------------------------------------------------
    // computeValue() - node-set comparisons (ใช้ JDOM เพราะอยู่ใน classpath)
    // แบบนี้น่าจะกระตุ้น loop ภายใน equal() ของ CoreOperationCompare
    // (อนุมานจาก XPath spec, ไม่ได้ดู source ของ CoreOperationCompare จริง)
    // ---------------------------------------------------------------

    private JXPathContext buildJdomContext(String... itemTexts) {
        Element root = new Element("root");
        for (String text : itemTexts) {
            Element item = new Element("item");
            item.setText(text);
            root.addContent(item);
        }
        Document doc = new Document(root);
        return JXPathContext.newContext(doc);
    }

    @Test
    public void testComputeValue_NodeVsNode_Equal_ReturnsFalse() {
        JXPathContext ctx = buildJdomContext("1", "2", "1");
        Object result = ctx.getValue("/root/item[1] != /root/item[3]");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_NodeVsNode_NotEqual_ReturnsTrue() {
        JXPathContext ctx = buildJdomContext("1", "2", "1");
        Object result = ctx.getValue("/root/item[1] != /root/item[2]");
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_NodeSetVsLiteral_SomeDiffer_ReturnsTrue() {
        // node-set {1,2,1} != '2'  -> มีสมาชิกบางตัว (1) ที่ไม่เท่ากับ 2
        // -> existential quantification ของ XPath ทำให้ผลลัพธ์เป็น true
        JXPathContext ctx = buildJdomContext("1", "2", "1");
        Object result = ctx.getValue("/root/item != '2'");
        assertEquals(Boolean.TRUE, result);
    }

    @Test
    public void testComputeValue_NodeSetVsLiteral_AllEqual_ReturnsFalse() {
        // node-set {5,5,5} != '5' -> ไม่มีสมาชิกที่ต่างจาก 5 เลย -> false
        JXPathContext ctx = buildJdomContext("5", "5", "5");
        Object result = ctx.getValue("/root/item != '5'");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testComputeValue_EmptyNodeSetVsLiteral_ReturnsFalse() {
        // ไม่แน่ใจ 100% ว่า implementation ตรงกับ XPath spec เป๊ะ:
        // node-set ว่าง != '5' ตาม XPath 1.0 spec (existential quantification
        // บน set ว่าง) ควรได้ false เนื่องจากไม่มีสมาชิกให้เทียบเลย
        JXPathContext ctx = buildJdomContext(); // ไม่มี item
        Object result = ctx.getValue("/root/item != '5'");
        assertEquals(Boolean.FALSE, result);
    }

    // ---------------------------------------------------------------
    // Edge case: bean property เป็น null
    // ---------------------------------------------------------------

    public static class NullableBean {
        private String value; // default null
        public String getValue() {
            return value;
        }
    }

    @Test
    public void testComputeValue_NullBeanPropertyVsEmptyString() {
        // ไม่แน่ใจ 100% ว่า JXPath แปลง null property เป็น "" เสมอ
        // (ไม่มี source ของ core comparison/conversion ให้ยืนยัน)
        // แต่ใช้ convention ทั่วไปของ JXPath string() conversion
        JXPathContext ctx = JXPathContext.newContext(new NullableBean());
        Object result = ctx.getValue("value != ''");
        assertEquals(Boolean.FALSE, result);
    }
}
```

# สรุปตาราง Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testGetSymbol_ReturnsNotEqualSymbol` | `getSymbol()` คืนค่า `"!="` |
| `testGetSymbol_DoesNotDependOnArgs_EvenIfNull` | Constructor ยอมรับ `null` args (edge case), `getSymbol()` ไม่พึ่ง args |
| `testComputeValue_NumbersEqual_ReturnsFalse` | ternary: `equal()==true` → `Boolean.FALSE` (numeric) |
| `testComputeValue_NumbersNotEqual_ReturnsTrue` | ternary: `equal()==false` → `Boolean.TRUE` (numeric) |
| `testComputeValue_ZeroEqualsZero_ReturnsFalse` | boundary value `0` → equal branch |
| `testComputeValue_NegativeVsPositive_ReturnsTrue` | boundary value negative number → not-equal branch |
| `testComputeValue_StringsEqual_ReturnsFalse` | equal branch (string) |
| `testComputeValue_StringsNotEqual_ReturnsTrue` | not-equal branch (string) |
| `testComputeValue_EmptyStringVsEmptyString_ReturnsFalse` | boundary: empty string, equal branch |
| `testComputeValue_EmptyStringVsNonEmpty_ReturnsTrue` | boundary: empty string vs non-empty, not-equal branch |
| `testComputeValue_BooleansEqual_ReturnsFalse` | equal branch (boolean) |
| `testComputeValue_BooleansNotEqual_ReturnsTrue` | not-equal branch (boolean) |
| `testComputeValue_NumberVsNumericString_ReturnsFalse` | type coercion, equal branch |
| `testComputeValue_NumberVsEmptyString_ReturnsTrue` | type coercion/NaN edge, not-equal branch |
| `testComputeValue_NodeVsNode_Equal_ReturnsFalse` | node-set comparison, equal branch |
| `testComputeValue_NodeVsNode_NotEqual_ReturnsTrue` | node-set comparison, not-equal branch |
| `testComputeValue_NodeSetVsLiteral_SomeDiffer_ReturnsTrue` | node-set loop: บาง element ต่างกัน → true |
| `testComputeValue_NodeSetVsLiteral_AllEqual_ReturnsFalse` | node-set loop: ทุก element เท่ากัน → false |
| `testComputeValue_EmptyNodeSetVsLiteral_ReturnsFalse` | boundary: empty node-set (ไม่แน่ใจ 100%, มีคอมเมนต์กำกับ) |
| `testComputeValue_NullBeanPropertyVsEmptyString` | null/empty property edge case (มีคอมเมนต์กำกับความไม่แน่ใจ) |

**หมายเหตุสำคัญ:** เนื่องจาก `equal()` ถูก implement อยู่ใน `CoreOperationCompare` ซึ่งไม่มี source ให้ตรวจสอบตรง ๆ การทดสอบจึงอิง public API (`JXPathContext`) และมาตรฐาน XPath 1.0 spec แทนการเดา internal logic — จุดที่มีความไม่แน่ใจเกี่ยวกับ behavior จริงได้คอมเมนต์กำกับไว้ในโค้ดแล้ว