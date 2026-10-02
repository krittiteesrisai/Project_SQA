package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.jxpath.JXPathContext;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 test suite สำหรับ {@link CoreOperationEqual} (Defects4J: JxPath-9b)
 *
 * หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4):
 * - CoreOperationEqual เองมี logic เพียง ternary เดียวใน computeValue()
 *   (เรียก equal(...) จาก superclass CoreOperationCompare แล้วคืน Boolean.TRUE/FALSE)
 *   และ getSymbol() ที่ไม่มีเงื่อนไข
 * - ซอร์สของ CoreOperationCompare.equal(...) ไม่ได้ให้มาในโจทย์นี้ ดังนั้นการทดสอบ
 *   กรณีประเภทข้อมูลต่าง ๆ (string/number/boolean/node-set/NaN) อ้างอิงจากพฤติกรรม
 *   มาตรฐานของ XPath 1.0 ที่ JXPath ประกาศว่า implement ตาม spec โดยใช้ JXPathContext
 *   (public API ของ JXPath ที่คอมไพล์มาจาก source tree เดียวกัน) เป็นเครื่องมือกระตุ้น
 *   branch ภายใน equal() แบบ black-box หากพฤติกรรมจริงต่างจากที่สมมติไว้
 *   ถือเป็นสมมติฐานที่ต้องตรวจสอบเพิ่มเติม (ไม่ใช่การเดาแบบไม่มีมูล)
 * - ใช้ class Constant (org.apache.commons.jxpath.ri.compiler.Constant) เพื่อสร้าง
 *   Expression โดยตรงสำหรับ white-box test ของ computeValue(); อิง constructor
 *   Constant(String) และ Constant(double) ซึ่งเป็น API มาตรฐานของ JXPath และสมมติว่า
 *   Constant.computeValue(context) ไม่พึ่งพา context argument (จึงส่ง null ได้)
 */
public class CoreOperationEqualTest {

    private SampleBean bean;
    private JXPathContext context;

    @Before
    public void setUp() {
        bean = new SampleBean();
        context = JXPathContext.newContext(bean);
    }

    // =================================================================
    // 1) White-box: ทดสอบ computeValue()/getSymbol() ผ่าน Constant ตรง ๆ
    // =================================================================

    @Test
    public void testGetSymbol() {
        Expression arg1 = new Constant("x");
        Expression arg2 = new Constant("x");
        CoreOperationEqual op = new CoreOperationEqual(arg1, arg2);
        assertEquals("=", op.getSymbol());
    }

    @Test
    public void testComputeValue_StringsEqual_ReturnsTrue() {
        CoreOperationEqual op =
            new CoreOperationEqual(new Constant("abc"), new Constant("abc"));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_StringsNotEqual_ReturnsFalse() {
        CoreOperationEqual op =
            new CoreOperationEqual(new Constant("abc"), new Constant("xyz"));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_NumbersEqual_ReturnsTrue() {
        CoreOperationEqual op =
            new CoreOperationEqual(new Constant(5.0), new Constant(5.0));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_NumbersNotEqual_ReturnsFalse() {
        CoreOperationEqual op =
            new CoreOperationEqual(new Constant(5.0), new Constant(6.0));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_EmptyStringsEqual_ReturnsTrue() {
        // boundary: empty string vs empty string
        CoreOperationEqual op =
            new CoreOperationEqual(new Constant(""), new Constant(""));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_ZeroEqualsZero_ReturnsTrue() {
        // boundary: 0 = 0
        CoreOperationEqual op =
            new CoreOperationEqual(new Constant(0.0), new Constant(0.0));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_NegativeVsPositive_ReturnsFalse() {
        CoreOperationEqual op =
            new CoreOperationEqual(new Constant(-5.0), new Constant(5.0));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_NumericStringVsNumber_MatchingValues_ReturnsTrue() {
        // "10" (string) ถูกแปลงเป็นตัวเลขเพื่อเทียบกับ 10.0 ตาม XPath spec
        CoreOperationEqual op =
            new CoreOperationEqual(new Constant("10"), new Constant(10.0));
        assertEquals(Boolean.TRUE, op.computeValue(null));
    }

    @Test
    public void testComputeValue_MalformedNumericString_ReturnsFalse() {
        // อินพุตผิดรูปแบบ: "abc" แปลงเป็นตัวเลขไม่ได้ -> NaN -> ไม่เท่ากับ 10.0
        CoreOperationEqual op =
            new CoreOperationEqual(new Constant("abc"), new Constant(10.0));
        assertEquals(Boolean.FALSE, op.computeValue(null));
    }

    // =================================================================
    // 2) Black-box ผ่าน JXPathContext: กระตุ้น branch node-set / boolean /
    //    null / NaN ภายใน equal() ทางอ้อม
    // =================================================================

    @Test
    public void testXPath_SimpleNumberProperty_Equal_True() {
        assertEquals(Boolean.TRUE, context.getValue("intValue = 5"));
    }

    @Test
    public void testXPath_SimpleNumberProperty_Equal_False() {
        assertEquals(Boolean.FALSE, context.getValue("intValue = 6"));
    }

    @Test
    public void testXPath_StringProperty_Equal_True() {
        assertEquals(Boolean.TRUE, context.getValue("name = 'Apache'"));
    }

    @Test
    public void testXPath_StringProperty_Equal_False() {
        assertEquals(Boolean.FALSE, context.getValue("name = 'Other'"));
    }

    @Test
    public void testXPath_BooleanProperty_Equal_True() {
        assertEquals(Boolean.TRUE, context.getValue("flag = true()"));
    }

    @Test
    public void testXPath_BooleanProperty_Equal_False() {
        assertEquals(Boolean.FALSE, context.getValue("flag = false()"));
    }

    @Test
    public void testXPath_NodeSet_AnyElementMatches_ReturnsTrue() {
        // node-set เทียบกับ string: ถ้ามีสมาชิกใดใน node-set ตรงกับ string -> true
        assertEquals(Boolean.TRUE, context.getValue("items = 'b'"));
    }

    @Test
    public void testXPath_NodeSet_NoElementMatches_ReturnsFalse() {
        assertEquals(Boolean.FALSE, context.getValue("items = 'z'"));
    }

    @Test
    public void testXPath_NodeSet_LoopsThroughMultipleElements_MatchLast() {
        // ตรวจสอบว่า loop เปรียบเทียบจนถึงสมาชิกตัวสุดท้ายของ node-set ('c')
        assertEquals(Boolean.TRUE, context.getValue("items = 'c'"));
    }

    @Test
    public void testXPath_EmptyNodeSet_vs_String_ReturnsFalse() {
        // boundary: node-set ว่าง -> ไม่มีสมาชิกให้วนเทียบ -> ต้องเป็น false เสมอ
        assertEquals(Boolean.FALSE, context.getValue("emptyList = 'a'"));
    }

    @Test
    public void testXPath_EmptyStringProperty_vs_EmptyString_ReturnsTrue() {
        assertEquals(Boolean.TRUE, context.getValue("emptyString = ''"));
    }

    @Test
    public void testXPath_StringVsNumber_MalformedConversion_ReturnsFalse() {
        // "Apache" แปลงเป็นตัวเลขไม่ได้ -> NaN -> ไม่เท่ากับ intValue (5)
        assertEquals(Boolean.FALSE, context.getValue("name = intValue"));
    }

    @Test
    public void testXPath_SelfEquality_ReturnsTrue() {
        // reflexivity: ค่าเดียวกันเทียบกับตัวเอง
        assertEquals(Boolean.TRUE, context.getValue("doubleValue = doubleValue"));
    }

    @Test
    public void testXPath_NaNNumericEquality_ShouldBeFalse() {
        // *** จุดสำคัญ: probe สำหรับ defect JxPath-9b ***
        // ตาม XPath 1.0 spec: NaN ไม่เท่ากับ NaN เสมอ (ต้องได้ false)
        // ถ้า CoreOperationCompare.equal(...) เปรียบเทียบด้วย Double.equals()
        // (ซึ่งใน Java, Double.NaN.equals(Double.NaN) == true) แทนการตรวจ isNaN()/== 
        // assertion นี้จะ fail และเผยให้เห็น fault ที่แท้จริงของ Defects4J JxPath-9b
        Object result = context.getValue("(0 div 0) = (0 div 0)");
        assertEquals(Boolean.FALSE, result);
    }

    @Test
    public void testXPath_NaNVsNumber_ReturnsFalse() {
        // NaN เทียบกับตัวเลขปรกติต้องเป็น false เสมอ
        assertEquals(Boolean.FALSE, context.getValue("(0 div 0) = 1"));
    }

    // =================================================================
    // Sample bean ใช้เป็น root ของ JXPathContext
    // =================================================================
    public static class SampleBean {
        private String name = "Apache";
        private String emptyString = "";
        private int intValue = 5;
        private double doubleValue = 10.5;
        private boolean flag = true;
        private List items = Arrays.asList(new String[] {"a", "b", "c"});
        private List emptyList = new ArrayList();

        public String getName() {
            return name;
        }

        public String getEmptyString() {
            return emptyString;
        }

        public int getIntValue() {
            return intValue;
        }

        public double getDoubleValue() {
            return doubleValue;
        }

        public boolean isFlag() {
            return flag;
        }

        public List getItems() {
            return items;
        }

        public List getEmptyList() {
            return emptyList;
        }
    }
}
