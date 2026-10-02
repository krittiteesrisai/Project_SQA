# วิเคราะห์และแผนการทดสอบ

เนื่องจาก `CoreFunction` พึ่งพา internal interface อย่าง `EvalContext`, `NodePointer` ที่ไม่ได้แสดง source มาให้ (จึงไม่ควรเดา method signature ของมัน) ผมจึงเลือกใช้ 2 แนวทางผสมกัน:

1. **Black-box ผ่าน public API** (`JXPathContext`) — ใช้ XPath string เรียกฟังก์ชันจริง ครอบคลุม logic ภายใน `functionXxx()` ต่าง ๆ ผ่านสภาพแวดล้อมจริง (ใช้ JDOM document เพื่อให้มี Node/NamedNode สำหรับฟังก์ชันที่ต้องพึ่ง context เช่น `last()`, `position()`, `name()`)
2. **White-box ตรง ๆ กับคลาส `CoreFunction`** โดยสร้าง instance ตรงด้วย `Compiler` constant + `Expression[]` (ใช้ nested `CoreFunction` เป็น `Expression` เพื่อเลี่ยงการเดา API ของ `Constant`) สำหรับทดสอบ `toString()`, `getFunctionCode()`, `getArgumentCount()`, `computeContextDependent()`, และ branch ที่ยากจะ trigger ผ่าน public API เช่น `FUNCTION_NULL`, default-switch ของ `getFunctionName()`/`computeValue()`

หมายเหตุสำคัญ (ตามข้อกำหนด #4): บาง behavior (เช่น `id()`, `key()`, การ resolve locale ของ `format-number` ผ่าน `pointer.getLocale()`, ความแม่นยำของ `lang()` matching) ไม่ได้แสดงใน source ที่ให้มา — ผมจึงทดสอบเฉพาะส่วนที่ยืนยันได้จาก source และ **คอมเมนต์กำกับ** ส่วนที่ไม่แน่ใจไว้ชัดเจน

```java
package org.apache.commons.jxpath.ri.compiler;

import static org.junit.Assert.*;

import java.util.Locale;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
import org.apache.commons.jxpath.ri.Compiler;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link CoreFunction}.
 *
 * หมายเหตุ: EvalContext / NodePointer เป็น internal interface ที่ไม่ได้แสดง source มาด้วย
 * จึงไม่ได้ mock ขึ้นมาตรง ๆ (เพื่อไม่เดา API) แต่ใช้ JXPathContext (public API) ในการขับเคลื่อน
 * การทำงานจริงของ EvalContext/NodePointer ผ่าน JDOM model แทน
 *
 * สำหรับ branch ที่ไม่สามารถ trigger ผ่าน public XPath parser ได้ (เช่น FUNCTION_NULL,
 * default-case ของ switch, null-args) จะเรียก CoreFunction ตรง ๆ (white-box)
 */
public class CoreFunctionTest {

    private JXPathContext docContext;      // /root/item (3 nodes: 10,20,30)
    private JXPathContext leafHelloContext; // root element มี text = "Hello"
    private JXPathContext leaf42Context;    // root element มี text = "42"
    private JXPathContext langContext;      // root element มี xml:lang="en"
    private JXPathContext nsContext;        // root element มี namespace

    @Before
    public void setUp() {
        Element root = new Element("root");
        for (int i = 1; i <= 3; i++) {
            Element item = new Element("item");
            item.setText(String.valueOf(i * 10));
            root.addContent(item);
        }
        Document document = new Document(root);
        docContext = JXPathContext.newContext(document);
        docContext.setLocale(Locale.US); // ลด risk ของ locale-dependent assertion

        Element helloLeaf = new Element("leaf");
        helloLeaf.setText("Hello");
        leafHelloContext = JXPathContext.newContext(helloLeaf);

        Element numLeaf = new Element("leaf");
        numLeaf.setText("42");
        leaf42Context = JXPathContext.newContext(numLeaf);

        Element langLeaf = new Element("leaf");
        langLeaf.setAttribute("lang", "en", Namespace.XML_NAMESPACE);
        langContext = JXPathContext.newContext(langLeaf);

        Namespace ns = Namespace.getNamespace("http://example.com/ns");
        Element nsLeaf = new Element("item", ns);
        nsContext = JXPathContext.newContext(nsLeaf);
    }

    // ==================================================================
    // ========== WHITE-BOX: direct construction ของ CoreFunction ==========
    // ==================================================================

    @Test
    public void testGetFunctionCode() {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        assertEquals(Compiler.FUNCTION_TRUE, f.getFunctionCode());
    }

    @Test
    public void testGetArgumentCount_NullArgs() {
        // ครอบคลุม branch "args == null -> return 0" ของ getArgumentCount()
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals(0, f.getArgumentCount());
    }

    @Test
    public void testGetArgumentCount_WithArgs() {
        Expression[] args = new Expression[] {
            new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0])
        };
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_NOT, args);
        assertEquals(1, f.getArgumentCount());
    }

    @Test
    public void testToString_NullArgs_NoParens() {
        // args == null -> toString() ไม่ loop ใส่ argument
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals("true()", f.toString());
    }

    @Test
    public void testToString_EmptyArgsArray() {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_FALSE, new Expression[0]);
        assertEquals("false()", f.toString());
    }

    @Test
    public void testToString_MultipleArgs_CommaSeparator() {
        // ครอบคลุม loop: i==0 ไม่ใส่ comma, i>0 ใส่ ", "
        Expression trueFn = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        CoreFunction concatFn = new CoreFunction(
            Compiler.FUNCTION_CONCAT, new Expression[] { trueFn, trueFn });
        assertEquals("concat(true(), true())", concatFn.toString());
    }

    @Test
    public void testToString_UnknownFunctionCode_DefaultName() {
        // ครอบคลุม default branch ของ getFunctionName()
        CoreFunction f = new CoreFunction(9999, null);
        assertEquals("unknownFunction9999()", f.toString());
    }

    @Test
    public void testComputeValue_FunctionNull() {
        // FUNCTION_NULL ไม่สามารถเรียกผ่าน XPath string ได้ (ไม่มี keyword "null()")
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_NULL, new Expression[0]);
        assertNull(f.computeValue(null));
    }

    @Test
    public void testComputeValue_UnknownFunctionCode_ReturnsNull() {
        // ครอบคลุม default (ตกออกจาก switch) ของ computeValue()
        CoreFunction f = new CoreFunction(12345, new Expression[0]);
        assertNull(f.computeValue(null));
    }

    @Test
    public void testComputeAndComputeValue_True() {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        assertEquals(Boolean.TRUE, f.computeValue(null));
        assertEquals(Boolean.TRUE, f.compute(null));
    }

    @Test
    public void testComputeValue_False() {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_FALSE, new Expression[0]);
        assertEquals(Boolean.FALSE, f.computeValue(null));
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testAssertArgCount_TooFewArgs_Direct() {
        // count() ต้องการ 1 arg, ให้ null (=0 args) -> ct(0) < min(1)
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_COUNT, null);
        f.computeValue(null);
    }

    @Test(expected = JXPathInvalidSyntaxException.class)
    public void testAssertArgCount_TooManyArgs_Direct() {
        // true() ต้องการ 0 args, ให้ array ขนาด 1 (element เป็น null ก็ไม่ถูก dereference
        // เพราะ exception จะถูก throw ก่อนถึงจุดนั้น) -> ct(1) > max(0)
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[1]);
        f.computeValue(null);
    }

    // ---------- computeContextDependent() ----------

    @Test
    public void testComputeContextDependent_LastAlwaysTrue() {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_LAST, new Expression[0]);
        assertTrue(f.computeContextDependent());
    }

    @Test
    public void testComputeContextDependent_PositionAlwaysTrue() {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_POSITION, new Expression[0]);
        assertTrue(f.computeContextDependent());
    }

    @Test
    public void testComputeContextDependent_StringNoArgs_True() {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_STRING, new Expression[0]);
        assertTrue(f.computeContextDependent());
    }

    @Test
    public void testComputeContextDependent_StringWithArg_False() {
        Expression trueFn = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        CoreFunction f = new CoreFunction(
            Compiler.FUNCTION_STRING, new Expression[] { trueFn });
        assertFalse(f.computeContextDependent());
    }

    @Test
    public void testComputeContextDependent_CountWithArg_False() {
        Expression trueFn = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        CoreFunction f = new CoreFunction(
            Compiler.FUNCTION_COUNT, new Expression[] { trueFn });
        assertFalse(f.computeContextDependent());
    }

    @Test
    public void testComputeContextDependent_FormatNumberTwoArgs_True() {
        Expression a = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        Expression b = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        CoreFunction f = new CoreFunction(
            Compiler.FUNCTION_FORMAT_NUMBER, new Expression[] { a, b });
        assertTrue(f.computeContextDependent());
    }

    @Test
    public void testComputeContextDependent_FormatNumberThreeArgs_False() {
        Expression a = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        Expression b = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        Expression c = new CoreFunction(Compiler.FUNCTION_TRUE, new Expression[0]);
        CoreFunction f = new CoreFunction(
            Compiler.FUNCTION_FORMAT_NUMBER, new Expression[] { a, b, c });
        assertFalse(f.computeContextDependent());
    }

    @Test
    public void testComputeContextDependent_UnknownCode_DefaultFalse() {
        CoreFunction f = new CoreFunction(9999, new Expression[0]);
        assertFalse(f.computeContextDependent());
    }

    // ==================================================================
    // ========== BLACK-BOX: ผ่าน JXPathContext (public API) ==========
    // ==================================================================

    // ---------- count() ----------

    @Test
    public void testCount_NodeSet() {
        Object v = docContext.getValue("count(/root/item)");
        assertEquals(3.0, ((Number) v).doubleValue(), 0.0001);
    }

    @Test
    public void testCount_EmptyNodeSetOrNull_ReturnsZero() {
        // ไม่สามารถยืนยันแน่ชัดว่า compute() ของ path ที่ไม่ match จะ return EvalContext ว่าง
        // หรือ null (ทั้งสอง branch ของ functionCount ให้ผลลัพธ์เท่ากันคือ 0)
        Object v = docContext.getValue("count(/root/missing)");
        assertEquals(0.0, ((Number) v).doubleValue(), 0.0001);
    }

    @Test
    public void testCount_Collection() {
        docContext.getVariables().declareVariable(
            "aList", java.util.Arrays.asList("a", "b", "c", "d"));
        Object v = docContext.getValue("count($aList)");
        assertEquals(4.0, ((Number) v).doubleValue(), 0.0001);
    }

    @Test
    public void testCount_NullVariable() {
        docContext.getVariables().declareVariable("nullVar", null);
        Object v = docContext.getValue("count($nullVar)");
        assertEquals(0.0, ((Number) v).doubleValue(), 0.0001);
    }

    @Test
    public void testCount_ScalarElse() {
        docContext.getVariables().declareVariable("scalarVar", "hello");
        Object v = docContext.getValue("count($scalarVar)");
        assertEquals(1.0, ((Number) v).doubleValue(), 0.0001);
    }

    @Test
    public void testCount_WrongArgCount() {
        try {
            docContext.getValue("count()");
            fail("Expected JXPathInvalidSyntaxException");
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("count(") >= 0);
        }
    }

    // ---------- last() / position() ----------

    @Test
    public void testLastAndPosition_SelectsLastNode() {
        Object v = docContext.getValue("string(/root/item[position()=last()])");
        assertEquals("30", v);
    }

    @Test
    public void testLast_WrongArgCount() {
        try {
            docContext.getValue("last(1)");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("last(") >= 0);
        }
    }

    @Test
    public void testPosition_WrongArgCount() {
        try {
            docContext.getValue("position(1)");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("position(") >= 0);
        }
    }

    // ---------- sum() ----------

    @Test
    public void testSum_NodeSet() {
        Object v = docContext.getValue("sum(/root/item)");
        assertEquals(60.0, ((Number) v).doubleValue(), 0.0001);
    }

    @Test
    public void testSum_EmptyNodeSet_ReturnsZero() {
        Object v = docContext.getValue("sum(/root/missing)");
        assertEquals(0.0, ((Number) v).doubleValue(), 0.0001);
    }

    @Test
    public void testSum_NullVariable_ReturnsZero() {
        docContext.getVariables().declareVariable("sumNull", null);
        Object v = docContext.getValue("sum($sumNull)");
        assertEquals(0.0, ((Number) v).doubleValue(), 0.0001);
    }

    @Test
    public void testSum_InvalidType_Throws() {
        try {
            docContext.getValue("sum('abc')");
            fail("Expected JXPathException for invalid sum() argument type");
        } catch (JXPathException e) {
            assertTrue(e.getMessage().indexOf("sum") >= 0);
        }
    }

    @Test
    public void testSum_WrongArgCount() {
        try {
            docContext.getValue("sum()");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("sum(") >= 0);
        }
    }

    // ---------- concat() ----------

    @Test
    public void testConcat_Basic() {
        Object v = docContext.getValue("concat('foo','bar','baz')");
        assertEquals("foobarbaz", v);
    }

    @Test
    public void testConcat_TooFewArgs_Throws() {
        try {
            docContext.getValue("concat('only-one')");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("concat(") >= 0);
        }
    }

    // ---------- starts-with() / contains() ----------

    @Test
    public void testStartsWith_TrueFalse() {
        assertEquals(Boolean.TRUE, docContext.getValue("starts-with('hello','he')"));
        assertEquals(Boolean.FALSE, docContext.getValue("starts-with('hello','world')"));
    }

    @Test
    public void testStartsWith_WrongArgCount() {
        try {
            docContext.getValue("starts-with('a')");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("starts-with(") >= 0);
        }
    }

    @Test
    public void testContains_TrueFalse() {
        assertEquals(Boolean.TRUE, docContext.getValue("contains('hello','ell')"));
        assertEquals(Boolean.FALSE, docContext.getValue("contains('hello','xyz')"));
    }

    // ---------- substring-before() / substring-after() ----------

    @Test
    public void testSubstringBefore_Found() {
        assertEquals("1999/", docContext.getValue("substring-before('1999/04/01','04/01')"));
    }

    @Test
    public void testSubstringBefore_NotFound_ReturnsEmpty() {
        assertEquals("", docContext.getValue("substring-before('1999','xx')"));
    }

    @Test
    public void testSubstringAfter_Found() {
        assertEquals("04/01", docContext.getValue("substring-after('1999/04/01','1999/')"));
    }

    @Test
    public void testSubstringAfter_NotFound_ReturnsEmpty() {
        assertEquals("", docContext.getValue("substring-after('1999','xx')"));
    }

    // ---------- substring() : ครอบคลุมเกือบทุก branch ----------

    @Test
    public void testSubstring_TwoArgs_Basic() {
        assertEquals("2345", docContext.getValue("substring('12345',2)"));
    }

    @Test
    public void testSubstring_TwoArgs_RoundedStart() {
        // ตัวอย่างมาตรฐาน XPath spec: substring("12345",1.5) = "2345"
        assertEquals("2345", docContext.getValue("substring('12345',1.5)"));
    }

    @Test
    public void testSubstring_TwoArgs_NegativeStart_ClampedToOne() {
        assertEquals("12345", docContext.getValue("substring('12345',-5)"));
    }

    @Test
    public void testSubstring_NaNStart_ReturnsEmpty() {
        assertEquals("", docContext.getValue("substring('12345', 0 div 0)"));
    }

    @Test
    public void testSubstring_StartBeyondLength_ReturnsEmpty() {
        assertEquals("", docContext.getValue("substring('12345',10)"));
    }

    @Test
    public void testSubstring_ThreeArgs_Basic() {
        // ตัวอย่างมาตรฐาน XPath spec: substring("12345",2,3) = "234"
        assertEquals("234", docContext.getValue("substring('12345',2,3)"));
    }

    @Test
    public void testSubstring_NegativeLength_ReturnsEmpty() {
        assertEquals("", docContext.getValue("substring('12345',2,-3)"));
    }

    @Test
    public void testSubstring_ToLessThanOne_ReturnsEmpty() {
        assertEquals("", docContext.getValue("substring('12345',-5,3)"));
    }

    @Test
    public void testSubstring_ToBeyondLength_ClampsEnd() {
        assertEquals("345", docContext.getValue("substring('12345',3,10)"));
    }

    @Test
    public void testSubstring_WrongArgCount_TooFew() {
        try {
            docContext.getValue("substring('abc')");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("substring(") >= 0);
        }
    }

    @Test
    public void testSubstring_WrongArgCount_TooMany() {
        try {
            docContext.getValue("substring('abc',1,2,3)");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("substring(") >= 0);
        }
    }

    // ---------- string-length() ----------

    @Test
    public void testStringLength_OneArg() {
        Object v = docContext.getValue("string-length('hello')");
        assertEquals(5.0, ((Number) v).doubleValue(), 0.0001);
    }

    @Test
    public void testStringLength_ZeroArgs_UsesContextNode() {
        Object v = leafHelloContext.getValue("string-length()");
        assertEquals(5.0, ((Number) v).doubleValue(), 0.0001);
    }

    // ---------- normalize-space() ----------

    @Test
    public void testNormalizeSpace_LeadingTrailingAndMultipleSpaces() {
        assertEquals("hello world",
            docContext.getValue("normalize-space('  hello   world  ')"));
    }

    @Test
    public void testNormalizeSpace_NoSpaces() {
        assertEquals("hello", docContext.getValue("normalize-space('hello')"));
    }

    @Test
    public void testNormalizeSpace_AllSpaces_ReturnsEmpty() {
        assertEquals("", docContext.getValue("normalize-space('    ')"));
    }

    @Test
    public void testNormalizeSpace_EmptyString() {
        assertEquals("", docContext.getValue("normalize-space('')"));
    }

    // ---------- translate() ----------

    @Test
    public void testTranslate_Basic() {
        // ตัวอย่างมาตรฐาน XPath spec: translate("bar","abc","ABC") = "BAr"
        assertEquals("BAr", docContext.getValue("translate('bar','abc','ABC')"));
    }

    @Test
    public void testTranslate_DeletionWhenTargetShorterThanFrom() {
        // ตัวอย่างมาตรฐาน XPath spec: translate("--aaa--","abc-","ABC") = "AAA"
        assertEquals("AAA", docContext.getValue("translate('--aaa--','abc-','ABC')"));
    }

    @Test
    public void testTranslate_CharNotInFrom_Unchanged() {
        assertEquals("xyz", docContext.getValue("translate('xyz','abc','ABC')"));
    }

    @Test
    public void testTranslate_WrongArgCount() {
        try {
            docContext.getValue("translate('a','b')");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("translate(") >= 0);
        }
    }

    // ---------- boolean() / not() / true() / false() ----------

    @Test
    public void testBoolean_Values() {
        assertEquals(Boolean.FALSE, docContext.getValue("boolean('')"));
        assertEquals(Boolean.TRUE, docContext.getValue("boolean('x')"));
        assertEquals(Boolean.FALSE, docContext.getValue("boolean(0)"));
        assertEquals(Boolean.TRUE, docContext.getValue("boolean(1)"));
    }

    @Test
    public void testNot_Values() {
        assertEquals(Boolean.FALSE, docContext.getValue("not(true())"));
        assertEquals(Boolean.TRUE, docContext.getValue("not(false())"));
    }

    @Test
    public void testTrueFalse() {
        assertEquals(Boolean.TRUE, docContext.getValue("true()"));
        assertEquals(Boolean.FALSE, docContext.getValue("false()"));
    }

    // ---------- number() ----------

    @Test
    public void testNumber_OneArg_Valid() {
        Object v = docContext.getValue("number('42')");
        assertEquals(42.0, ((Number) v).doubleValue(), 0.0001);
    }

    @Test
    public void testNumber_OneArg_NaN() {
        Object v = docContext.getValue("number('abc')");
        assertTrue(Double.isNaN(((Number) v).doubleValue()));
    }

    @Test
    public void testNumber_ZeroArgs_UsesContextNode() {
        Object v = leaf42Context.getValue("number()");
        assertEquals(42.0, ((Number) v).doubleValue(), 0.0001);
    }

    // ---------- floor() / ceiling() / round() ----------

    @Test
    public void testFloor() {
        assertEquals(3.0, ((Number) docContext.getValue("floor(3.7)")).doubleValue(), 0.0001);
        assertEquals(-4.0, ((Number) docContext.getValue("floor(-3.2)")).doubleValue(), 0.0001);
    }

    @Test
    public void testCeiling() {
        assertEquals(4.0, ((Number) docContext.getValue("ceiling(3.2)")).doubleValue(), 0.0001);
        assertEquals(-3.0, ((Number) docContext.getValue("ceiling(-3.7)")).doubleValue(), 0.0001);
    }

    @Test
    public void testRound_PositiveHalf() {
        // Math.round ปัดเข้าหา +infinity เมื่อเป็นค่ากึ่ง
        assertEquals(3.0, ((Number) docContext.getValue("round(2.5)")).doubleValue(), 0.0001);
        assertEquals(4.0, ((Number) docContext.getValue("round(3.5)")).doubleValue(), 0.0001);
    }

    @Test
    public void testRound_NegativeHalf() {
        assertEquals(-2.0, ((Number) docContext.getValue("round(-2.5)")).doubleValue(), 0.0001);
    }

    @Test
    public void testFloor_WrongArgCount() {
        try {
            docContext.getValue("floor()");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("floor(") >= 0);
        }
    }

    // ---------- format-number() ----------

    @Test
    public void testFormatNumber_TwoArgs() {
        // สมมติฐาน: pointer.getLocale() สอดคล้องกับ context.setLocale(...) ที่ตั้งไว้ใน setUp()
        Object v = docContext.getValue("format-number(1234.5, '#,##0.00')");
        assertEquals("1,234.50", v);
    }

    @Test
    public void testFormatNumber_WrongArgCount() {
        try {
            docContext.getValue("format-number(1)");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("format-number(") >= 0);
        }
    }

    // ---------- name() / local-name() / namespace-uri() ----------

    @Test
    public void testName_OneArg_FromNodeSet() {
        assertEquals("item", docContext.getValue("name(/root/item[1])"));
    }

    @Test
    public void testName_OneArg_EmptyNodeSet_ReturnsEmpty() {
        assertEquals("", docContext.getValue("name(/root/missing)"));
    }

    @Test
    public void testName_OneArg_NonEvalContext_ReturnsEmpty() {
        assertEquals("", docContext.getValue("name('abc')"));
    }

    @Test
    public void testName_ZeroArgs_UsesContextNode() {
        assertEquals("leaf", leafHelloContext.getValue("name()"));
    }

    @Test
    public void testLocalName_OneArg_FromNodeSet() {
        assertEquals("item", docContext.getValue("local-name(/root/item[1])"));
    }

    @Test
    public void testLocalName_ZeroArgs_UsesContextNode() {
        assertEquals("leaf", leafHelloContext.getValue("local-name()"));
    }

    @Test
    public void testNamespaceUri_OneArg_NoNamespace_ReturnsEmpty() {
        assertEquals("", docContext.getValue("namespace-uri(/root/item[1])"));
    }

    @Test
    public void testNamespaceUri_ZeroArgs_NoNamespace_ReturnsEmpty() {
        assertEquals("", leafHelloContext.getValue("namespace-uri()"));
    }

    @Test
    public void testNamespaceUri_ZeroArgs_WithNamespace() {
        assertEquals("http://example.com/ns", nsContext.getValue("namespace-uri()"));
    }

    // ---------- lang() ----------

    @Test
    public void testLang_Match() {
        assertEquals(Boolean.TRUE, langContext.getValue("lang('en')"));
    }

    @Test
    public void testLang_NoMatch() {
        assertEquals(Boolean.FALSE, langContext.getValue("lang('fr')"));
    }

    @Test
    public void testLang_WrongArgCount() {
        try {
            langContext.getValue("lang()");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("lang(") >= 0);
        }
    }

    // ---------- id() / key() : ทดสอบเฉพาะ argument-count validation ----------
    // หมายเหตุ: ไม่ทดสอบผลลัพธ์จริงของ id()/key() เพราะพึ่งพากลไก ID/Key resolution
    // ของ model (NodePointer.getPointerByID / JXPathContext.getNodeSetByKey) ซึ่งไม่มี
    // source แสดงมาให้ จึงไม่ควรเดา behavior

    @Test
    public void testId_WrongArgCount() {
        try {
            docContext.getValue("id()");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("id(") >= 0);
        }
    }

    @Test
    public void testKey_WrongArgCount() {
        try {
            docContext.getValue("key('k')");
            fail();
        } catch (JXPathInvalidSyntaxException e) {
            assertTrue(e.getMessage().indexOf("key(") >= 0);
        }
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| กลุ่มเมธอดทดสอบ | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testGetArgumentCount_*`, `testToString_NullArgs*`, `testToString_EmptyArgsArray`, `testToString_MultipleArgs*`, `testToString_UnknownFunctionCode*` | `getArgumentCount()`: args==null vs ไม่ null; `toString()`: `if(args!=null)`, loop `i>0` comma; `getFunctionName()` default-case |
| `testComputeValue_FunctionNull`, `testComputeValue_UnknownFunctionCode*` | `computeValue()` switch-case `FUNCTION_NULL` (unreachable ผ่าน parser) และ default (ไม่ match case ใด) |
| `testComputeAndComputeValue_True/False` | `computeValue`/`compute` case TRUE/FALSE, `functionTrue`, `functionFalse` |
| `testAssertArgCount_TooFewArgs_Direct`, `testAssertArgCount_TooManyArgs_Direct` | `assertArgRange`: `ct<min` และ `ct>max` (ทั้งสองทิศทางของ compound OR) |
| `testComputeContextDependent_*` | `computeContextDependent()`: case LAST/POSITION(true เสมอ), STRING (args 0 vs มี arg), COUNT (false เสมอ), FORMAT_NUMBER (args.length==2 vs ==3), default |
| `testCount_*` | `functionCount`: EvalContext loop (มี/ไม่มี node), Collection, null, else(scalar), assertArgCount ผิด |
| `testLastAndPosition_*`, `testLast_WrongArgCount`, `testPosition_WrongArgCount` | `functionLast` reset/iterate/setPosition, `functionPosition`, assertArgCount(0) ผิด |
| `testSum_*` | `functionSum`: null→ZERO, EvalContext loop (มี/ไม่มี node), throw JXPathException (type ผิด), assertArgCount ผิด |
| `testConcat_*` | `functionConcat`: ac<2 throw, ac>=2 loop concatenation |
| `testStartsWith_*`, `testContains_*` | `functionStartsWith`/`functionContains`: true/false ของ `startsWith`/`indexOf` |
| `testSubstringBefore_*`, `testSubstringAfter_*` | index==-1 (not found) vs found |
| `testSubstring_*` (10 เทส) | ทุก branch: NaN, from>len+1, ac==2 (from<1 clamp), ac==3 length<0, to<1, to>len+1, normal case, assertArgCount ผิด (น้อย/มากเกิน) |
| `testStringLength_*` | ac==0 (ใช้ context node) vs ac==1 |
| `testNormalizeSpace_*` | phase 0/1/2 ทุก transition, trailing-space decrement, empty string |
| `testTranslate_*` | `inx!=-1` (map) กับ `inx<s3.length()` true/false (delete), `inx==-1` (unchanged), assertArgCount ผิด |
| `testBoolean_Values`, `testNot_Values`, `testTrueFalse` | ternary true/false ของแต่ละฟังก์ชัน |
| `testNumber_*` | ac==0 vs ac==1, ค่าปกติ vs NaN |
| `testFloor`, `testCeiling`, `testRound_*` | ค่าบวก/ลบ และค่ากึ่ง (boundary rounding) |
| `testFormatNumber_*` | ac==2 (locale จาก pointer), assertArgCount ผิด (3-arg symbols ไม่ทดสอบเพราะไม่มั่นใจ API — มีคอมเมนต์กำกับ) |
| `testName_*`, `testLocalName_*`, `testNamespaceUri_*` | ac==0 vs ac==1; `set instanceof EvalContext` true(มี/ไม่มี node)/false; null vs non-null namespace |
| `testLang_*` | `isLanguage()` true/false, assertArgCount ผิด |
| `testId_WrongArgCount`, `testKey_WrongArgCount` | assertArgCount ผิด เท่านั้น (ผลลัพธ์จริงไม่ทดสอบ เพราะไม่มี source ของ ID/Key resolution) |

**ข้อจำกัด/สมมติฐานที่คอมเมนต์ไว้ในโค้ด:** พฤติกรรมละเอียดของ `lang()` (case-insensitive/prefix matching), `id()`/`key()` resolution, การ propagate locale ผ่าน `pointer.getLocale()`, และ `format-number` แบบ 3-args (ต้องใช้ API ลงทะเบียน `DecimalFormatSymbols` ที่ไม่ปรากฏใน source ที่ให้มา) — ไม่ได้ทดสอบเชิงลึกเพื่อไม่ "เดา" behavior ตามข้อกำหนด