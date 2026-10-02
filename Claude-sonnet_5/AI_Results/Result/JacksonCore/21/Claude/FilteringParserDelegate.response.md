# วิเคราะห์และแนวทางการทดสอบ

จากการวิเคราะห์ซอร์สโค้ด `FilteringParserDelegate` พบว่าโค้ดพึ่งพา collaborator ภายนอกคือ `TokenFilter` และ `TokenFilterContext` ซึ่ง**ไม่มีซอร์สโค้ดให้มา** ดังนั้นบางเทสจะต้องอิง behavior มาตรฐานที่ทราบจาก public API/comment ในซอร์สโค้ดเอง (เช่น `TokenFilter.INCLUDE_ALL`, ค่า `null` หมายถึง exclude, comment "leaves must be explicitly included") — จุดใดที่เป็นการสมมุติ (assumption) จะมีคอมเมนต์กำกับไว้ชัดเจนตามข้อกำหนด

```java
package com.fasterxml.jackson.core.filter;

import java.io.IOException;

import com.fasterxml.jackson.core.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class FilteringParserDelegateTest {

    // ---------- Helper ----------
    private JsonParser createParser(String json) throws IOException {
        return new JsonFactory().createParser(json);
    }

    // ---------- Custom TokenFilter สำหรับทดสอบ ----------

    /**
     * Filter ที่ include เฉพาะ property ชื่อที่กำหนด (ใช้ทดสอบ FIELD_NAME branch)
     * หมายเหตุ (assumption): filterStartObject()/filterStartArray() ที่ไม่ override
     * จะใช้ default implementation ของ TokenFilter ซึ่งคาดว่าคืนค่า `this`
     * (เพื่อให้เดินลึกลงไปตรวจสอบ field ภายในต่อได้) - ไม่มีซอร์สโค้ด TokenFilter ยืนยัน
     */
    static class NameFilter extends TokenFilter {
        private final String name;
        NameFilter(String name) { this.name = name; }
        @Override
        public TokenFilter includeProperty(String name) {
            return this.name.equals(name) ? TokenFilter.INCLUDE_ALL : null;
        }
    }

    /** Filter ที่ exclude array ทั้งก้อนตั้งแต่ START_ARRAY (คืน null จาก filterStartArray) */
    static class ExcludeArrayFilter extends TokenFilter {
        @Override
        public TokenFilter filterStartArray() { return null; }
    }

    /** Filter ที่ exclude object ทั้งก้อนตั้งแต่ START_OBJECT (คืน null จาก filterStartObject) */
    static class ExcludeObjectFilter extends TokenFilter {
        @Override
        public TokenFilter filterStartObject() { return null; }
    }

    // =========================================================
    // 1) Constructor / getter พื้นฐาน
    // =========================================================

    @Test
    public void testConstructorAndGetFilter() throws IOException {
        JsonParser p = createParser("1");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        assertSame(TokenFilter.INCLUDE_ALL, d.getFilter());
    }

    @Test
    public void testMatchCountNeverIncrementedInSource() throws IOException {
        JsonParser p = createParser("1 2 3");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(0, d.getMatchCount());
        d.nextToken();
        d.nextToken();
        // จากซอร์สโค้ดที่ให้มา ไม่มีจุดใด increment _matchCount เลย
        // ดังนั้นค่านี้ควรเป็น 0 เสมอ แม้จะมี token ที่ match แล้ว
        assertEquals(0, d.getMatchCount());
    }

    // =========================================================
    // 2) สถานะก่อนเรียก nextToken ครั้งแรก (boundary: null state)
    // =========================================================

    @Test
    public void testInitialStateBeforeAnyNextToken() throws IOException {
        JsonParser p = createParser("{}");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        assertNull(d.getCurrentToken());
        assertNull(d.currentToken());
        assertFalse(d.hasCurrentToken());
        assertEquals(JsonTokenId.ID_NO_TOKEN, d.getCurrentTokenId());
        assertEquals(JsonTokenId.ID_NO_TOKEN, d.currentTokenId());
        assertTrue(d.hasTokenId(JsonTokenId.ID_NO_TOKEN));
        assertTrue(d.hasToken(null));
        assertFalse(d.isExpectedStartArrayToken());
        assertFalse(d.isExpectedStartObjectToken());
        assertNull(d.getLastClearedToken());
    }

    @Test
    public void testHasTokenIdAndHasTokenAfterRead() throws IOException {
        JsonParser p = createParser("[1]");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        JsonToken t = d.nextToken();
        assertEquals(JsonToken.START_ARRAY, t);
        assertEquals(JsonTokenId.ID_START_ARRAY, d.getCurrentTokenId());
        assertEquals(JsonTokenId.ID_START_ARRAY, d.currentTokenId());
        assertTrue(d.hasTokenId(JsonTokenId.ID_START_ARRAY));
        assertFalse(d.hasTokenId(JsonTokenId.ID_START_OBJECT));
        assertTrue(d.hasToken(JsonToken.START_ARRAY));
        assertFalse(d.hasToken(JsonToken.START_OBJECT));
        assertTrue(d.isExpectedStartArrayToken());
        assertFalse(d.isExpectedStartObjectToken());
    }

    // =========================================================
    // 3) clearCurrentToken / getLastClearedToken
    // =========================================================

    @Test
    public void testClearCurrentTokenAndGetLastClearedToken() throws IOException {
        JsonParser p = createParser("true");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        d.nextToken();
        assertEquals(JsonToken.VALUE_TRUE, d.getCurrentToken());
        d.clearCurrentToken();
        assertNull(d.getCurrentToken());
        assertEquals(JsonToken.VALUE_TRUE, d.getLastClearedToken());
        // เรียกซ้ำตอน currToken เป็น null แล้ว -> branch (_currToken != null) เป็น false, ไม่ทับค่าเดิม
        d.clearCurrentToken();
        assertEquals(JsonToken.VALUE_TRUE, d.getLastClearedToken());
    }

    // =========================================================
    // 4) overrideCurrentName -> ต้อง throw UnsupportedOperationException
    // =========================================================

    @Test(expected = UnsupportedOperationException.class)
    public void testOverrideCurrentNameThrows() throws IOException {
        JsonParser p = createParser("1");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        d.overrideCurrentName("x");
    }

    // =========================================================
    // 5) Boundary / อินพุตว่าง / อินพุตผิดรูปแบบ
    // =========================================================

    @Test
    public void testEmptyInputReturnsNullImmediately() throws IOException {
        JsonParser p = createParser("");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        assertNull(d.nextToken());
        assertFalse(d.hasCurrentToken());
    }

    @Test(expected = JsonParseException.class)
    public void testMalformedJsonUnclosedObjectThrows() throws IOException {
        JsonParser p = createParser("{");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        d.nextToken(); // START_OBJECT - ok
        d.nextToken(); // ควร throw เพราะ input จบแบบไม่สมบูรณ์
    }

    @Test(expected = JsonParseException.class)
    public void testMalformedJsonUnquotedFieldNameThrows() throws IOException {
        JsonParser p = createParser("{a:1}");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        d.nextToken(); // START_OBJECT - ok
        d.nextToken(); // field name ไม่ quote -> ผิดรูปแบบตาม default JsonFactory
    }

    // =========================================================
    // 6) Full pass-through ด้วย TokenFilter.INCLUDE_ALL (เทสหลักที่มั่นใจสูงสุด
    //    เนื่องจากไม่ต้องพึ่งพา behavior ภายในของ TokenFilterContext/TokenFilter เลย
    //    เพราะทุก branch ที่เกี่ยวข้องเช็ค f == INCLUDE_ALL ก่อนเป็นอันดับแรก)
    // =========================================================

    @Test
    public void testFullPassThroughMatchesRawParser() throws IOException {
        String json = "{\"a\":1,\"b\":[true,false,null],\"c\":\"txt\"}";
        JsonParser raw = createParser(json);
        JsonParser inner = createParser(json);
        FilteringParserDelegate d = new FilteringParserDelegate(inner, TokenFilter.INCLUDE_ALL, true, true);

        JsonToken rt;
        while ((rt = raw.nextToken()) != null) {
            JsonToken ft = d.nextToken();
            assertEquals(rt, ft);
            if (rt == JsonToken.FIELD_NAME) {
                assertEquals(raw.getCurrentName(), d.getCurrentName());
            } else if (rt.isScalarValue()) {
                assertEquals(raw.getText(), d.getText());
            }
        }
        assertNull(d.nextToken());
    }

    // =========================================================
    // 7) allowMultipleMatches = false vs true (scalar top-level หลายค่า)
    //    ทดสอบ branch: !_allowMultipleMatches && currToken!=null && exposedContext==null
    //    และ isScalarValue() sub-branch
    // =========================================================

    @Test
    public void testAllowMultipleMatchesFalseStopsAfterFirstScalarMatch() throws IOException {
        JsonParser p = createParser("1 2");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals(1, d.getIntValue());
        // allowMultipleMatches=false -> หยุดหลัง match แรก ไม่อ่านค่า "2" ต่อ
        assertNull(d.nextToken());
    }

    @Test
    public void testAllowMultipleMatchesTrueContinuesAfterFirstScalarMatch() throws IOException {
        JsonParser p = createParser("1 2");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals(1, d.getIntValue());
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals(2, d.getIntValue());
        assertNull(d.nextToken());
    }

    // =========================================================
    // 8) allowMultipleMatches = false vs true (struct-end top-level หลาย array)
    //    ทดสอบ branch: isStructEnd() sub-branch ของ early-return block
    // =========================================================

    @Test
    public void testAllowMultipleMatchesFalseStopsAfterFirstArrayMatch() throws IOException {
        JsonParser p = createParser("[1] [2]");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, false, false);
        assertEquals(JsonToken.START_ARRAY, d.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals(1, d.getIntValue());
        assertEquals(JsonToken.END_ARRAY, d.nextToken());
        // หลัง END_ARRAY -> headContext กลับไปที่ root ซึ่ง isStartHandled()==true (root context)
        // -> เข้า branch คืนค่า null ทันที ไม่อ่าน array ที่สอง
        assertNull(d.nextToken());
    }

    @Test
    public void testAllowMultipleMatchesTrueContinuesAfterArrayMatch() throws IOException {
        JsonParser p = createParser("[1] [2]");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, false, true);
        assertEquals(JsonToken.START_ARRAY, d.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals(JsonToken.END_ARRAY, d.nextToken());
        assertEquals(JsonToken.START_ARRAY, d.nextToken());
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals(2, d.getIntValue());
        assertEquals(JsonToken.END_ARRAY, d.nextToken());
        assertNull(d.nextToken());
    }

    // =========================================================
    // 9) filter = null (boundary: null filter ไม่มีการเช็คใน constructor)
    //    ทดสอบ branch f == null สำหรับ START_OBJECT / START_ARRAY / default(scalar)
    // =========================================================

    @Test
    public void testNullFilterExcludesObjectEntirely() throws IOException {
        JsonParser p = createParser("{\"a\":1}");
        FilteringParserDelegate d = new FilteringParserDelegate(p, null, true, true);
        assertNull(d.nextToken());
    }

    @Test
    public void testNullFilterExcludesScalarEntirely() throws IOException {
        JsonParser p = createParser("42");
        FilteringParserDelegate d = new FilteringParserDelegate(p, null, true, true);
        assertNull(d.nextToken());
    }

    // =========================================================
    // 10) filterStartArray()/filterStartObject() คืนค่า null หลัง checkValue ผ่าน
    //     (คนละ branch จากข้อ 9 เพราะ f ไม่ใช่ null ตอนแรก แต่กลาย เป็น null
    //     หลังเรียก filterStartArray/filterStartObject)
    // =========================================================

    @Test
    public void testFilterStartArrayReturningNullExcludesArray() throws IOException {
        JsonParser p = createParser("[1,2,3] 9");
        FilteringParserDelegate d = new FilteringParserDelegate(p, new ExcludeArrayFilter(), true, true);
        // Array ถูก exclude ทั้งก้อน และค่า scalar top-level "9" ที่ตามมาก็ไม่ถูก include เช่นกัน
        // เพราะ root filter (ExcludeArrayFilter) ไม่ได้ override includeValue()
        // (assumption: default TokenFilter#includeValue() คืน false ตามคอมเมนต์ใน CUT
        //  "Otherwise not included (leaves must be explicitly included)")
        assertNull(d.nextToken());
    }

    @Test
    public void testFilterStartObjectReturningNullExcludesObject() throws IOException {
        JsonParser p = createParser("{\"a\":1} 9");
        FilteringParserDelegate d = new FilteringParserDelegate(p, new ExcludeObjectFilter(), true, true);
        assertNull(d.nextToken());
    }

    // =========================================================
    // 11) Field-name based filter: includePath = false (ไม่รวม path)
    //     ทดสอบ branch f == null (exclude property "a") และ f == INCLUDE_ALL (include "b")
    // =========================================================

    @Test
    public void testFieldFilterExcludeIncludePathFalse() throws IOException {
        JsonParser p = createParser("{\"a\":1,\"b\":2}");
        FilteringParserDelegate d = new FilteringParserDelegate(p, new NameFilter("b"), false, true);
        JsonToken t = d.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
        assertEquals(2, d.getIntValue());
        assertNull(d.nextToken());
    }

    // =========================================================
    // 12) Field-name based filter: includePath = true -> ต้อง buffer container
    //     ทดสอบ _nextTokenWithBuffering / _nextBuffered / exposedContext loop
    //     (assumption: TokenFilterContext.nextTokenToRead() คืนลำดับ
    //      START_OBJECT -> FIELD_NAME -> (null เมื่อหมด buffer) ตามลำดับปกติ
    //      ซึ่งไม่มีซอร์สโค้ดยืนยันตรง ๆ แต่สอดคล้องกับ design ที่ระบุใน Javadoc ของคลาส)
    // =========================================================

    @Test
    public void testFieldFilterIncludePathTrueBuffersContainer() throws IOException {
        JsonParser p = createParser("{\"a\":1,\"b\":2}");
        FilteringParserDelegate d = new FilteringParserDelegate(p, new NameFilter("b"), true, true);
        assertEquals(JsonToken.START_OBJECT, d.nextToken());
        assertEquals(JsonToken.FIELD_NAME, d.nextToken());
        assertEquals("b", d.getCurrentName());
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals(2, d.getIntValue());
        assertEquals(JsonToken.END_OBJECT, d.nextToken());
        assertNull(d.nextToken());
    }

    // =========================================================
    // 13) getCurrentName(): branch currToken==START_OBJECT/START_ARRAY vs อื่น ๆ
    // =========================================================

    @Test
    public void testGetCurrentNameForContainerStartsAndFields() throws IOException {
        JsonParser p = createParser("{\"x\":{\"y\":1}}");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);

        assertEquals(JsonToken.START_OBJECT, d.nextToken());
        // root ไม่มี parent -> null
        assertNull(d.getCurrentName());

        assertEquals(JsonToken.FIELD_NAME, d.nextToken());
        assertEquals("x", d.getCurrentName());

        assertEquals(JsonToken.START_OBJECT, d.nextToken());
        // currToken เป็น START_OBJECT -> คืนชื่อของ parent context ("x")
        assertEquals("x", d.getCurrentName());

        assertEquals(JsonToken.FIELD_NAME, d.nextToken());
        assertEquals("y", d.getCurrentName());

        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals("y", d.getCurrentName());

        assertEquals(JsonToken.END_OBJECT, d.nextToken());
        assertEquals(JsonToken.END_OBJECT, d.nextToken());
    }

    // =========================================================
    // 14) getParsingContext() delegate ไปที่ _filterContext()
    // =========================================================

    @Test
    public void testGetParsingContextDelegatesToFilterContext() throws IOException {
        JsonParser p = createParser("[1]");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        d.nextToken(); // START_ARRAY
        JsonStreamContext ctx = d.getParsingContext();
        assertNotNull(ctx);
        assertTrue(ctx.inArray());
    }

    // =========================================================
    // 15) nextValue(): branch t == FIELD_NAME -> เรียก nextToken() อีกครั้ง
    // =========================================================

    @Test
    public void testNextValueSkipsFieldNameToken() throws IOException {
        JsonParser p = createParser("{\"a\":5}");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        d.nextToken(); // START_OBJECT
        JsonToken t = d.nextValue();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
        assertEquals(5, d.getIntValue());
        assertEquals("a", d.getCurrentName());
    }

    // =========================================================
    // 16) skipChildren(): branch currToken ไม่ใช่ START_OBJECT/ARRAY -> return this ทันที
    //     และ branch currToken เป็น START_OBJECT -> loop นับ open/close จนครบ
    // =========================================================

    @Test
    public void testSkipChildrenOnNonContainerReturnsImmediately() throws IOException {
        JsonParser p = createParser("1 2");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        // currToken ยังเป็น null -> ไม่ใช่ START_OBJECT/START_ARRAY -> return this ทันที
        JsonParser result = d.skipChildren();
        assertSame(d, result);
        assertNull(d.getCurrentToken());
        // ยืนยันว่าไม่มีอะไรถูกอ่านไปก่อนหน้า
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals(1, d.getIntValue());
    }

    @Test
    public void testSkipChildrenSkipsNestedStructure() throws IOException {
        JsonParser p = createParser("{\"a\":{\"b\":1},\"c\":2} 99");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.START_OBJECT, d.nextToken());
        JsonParser result = d.skipChildren();
        assertSame(d, result);
        assertEquals(JsonToken.END_OBJECT, d.getCurrentToken());
        // อ่านต่อได้ปกติหลังข้าม object ทั้งก้อน (รวม nested object ภายใน)
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals(99, d.getIntValue());
    }

    // =========================================================
    // 17) Smoke test: การ delegate accessor ค่าต่าง ๆ ไปยัง underlying parser
    // =========================================================

    @Test
    public void testScalarValueAccessorsDelegate() throws IOException {
        JsonParser p = createParser("123");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        assertEquals(JsonToken.VALUE_NUMBER_INT, d.nextToken());
        assertEquals(123, d.getIntValue());
        assertEquals(123L, d.getLongValue());
        assertEquals("123", d.getText());
    }

    @Test
    public void testLocationDelegation() throws IOException {
        JsonParser p = createParser("1");
        FilteringParserDelegate d = new FilteringParserDelegate(p, TokenFilter.INCLUDE_ALL, true, true);
        d.nextToken();
        assertNotNull(d.getCurrentLocation());
        assertNotNull(d.getTokenLocation());
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorAndGetFilter` | Constructor, `getFilter()` |
| `testMatchCountNeverIncrementedInSource` | `getMatchCount()` (พฤติกรรมจริงจากซอร์ส – ไม่มีการ increment) |
| `testInitialStateBeforeAnyNextToken` | `_currToken == null` ทุก accessor (getCurrentToken, hasCurrentToken, hasTokenId ID_NO_TOKEN, hasToken(null)) |
| `testHasTokenIdAndHasTokenAfterRead` | `hasTokenId`/`hasToken` เมื่อ `_currToken != null`, true/false branch |
| `testClearCurrentTokenAndGetLastClearedToken` | `clearCurrentToken()` ทั้ง `_currToken != null` และ `== null` branch |
| `testOverrideCurrentNameThrows` | `overrideCurrentName` throw exception |
| `testEmptyInputReturnsNullImmediately` | boundary: input ว่าง, `delegate.nextToken()==null` |
| `testMalformedJsonUnclosedObjectThrows` / `...UnquotedFieldNameThrows` | อินพุตผิดรูปแบบ → exception propagate |
| `testFullPassThroughMatchesRawParser` | ทุก branch ที่เช็ค `f==INCLUDE_ALL` ใน START_ARRAY/START_OBJECT/FIELD_NAME/default (scalar), END_ARRAY/END_OBJECT, exposedContext loop เมื่อไม่มี buffering |
| `testAllowMultipleMatchesFalseStopsAfterFirstScalarMatch` | early-return block: `isScalarValue()` sub-branch, `!_allowMultipleMatches` = true |
| `testAllowMultipleMatchesTrueContinuesAfterFirstScalarMatch` | `!_allowMultipleMatches` = false (bypass early-return) |
| `testAllowMultipleMatchesFalseStopsAfterFirstArrayMatch` | early-return block: `isStructEnd()` sub-branch |
| `testAllowMultipleMatchesTrueContinuesAfterArrayMatch` | เปรียบเทียบผลตรงข้ามกับกรณีก่อน |
| `testNullFilterExcludesObjectEntirely` / `...ScalarEntirely` | `f == null` branch ที่ START_OBJECT และ default(scalar) เมื่อ filter=null (boundary null) |
| `testFilterStartArrayReturningNullExcludesArray` | `f = f.filterStartArray()` แล้วได้ null, `createChildArrayContext(null,false)`, END_ARRAY (`gotEnd`/`returnEnd`) |
| `testFilterStartObjectReturningNullExcludesObject` | เหมือนข้างบนสำหรับ Object, FIELD_NAME กับ `f==null` ใน `_nextTokenWithBuffering` |
| `testFieldFilterExcludeIncludePathFalse` | FIELD_NAME: `f==null` (exclude "a"), `f==INCLUDE_ALL` (include "b"), `_includePath==false` |
| `testFieldFilterIncludePathTrueBuffersContainer` | `_includePath==true` → `_nextTokenWithBuffering`/`_nextBuffered`, exposedContext consumption loop |
| `testGetCurrentNameForContainerStartsAndFields` | `getCurrentName()`: `_currToken==START_OBJECT/START_ARRAY` vs อื่น ๆ, parent null vs ไม่ null |
| `testGetParsingContextDelegatesToFilterContext` | `getParsingContext()` / `_filterContext()` |
| `testNextValueSkipsFieldNameToken` | `nextValue()`: `t==FIELD_NAME` branch |
| `testSkipChildrenOnNonContainerReturnsImmediately` | `skipChildren()`: currToken ไม่ใช่ START_OBJECT/ARRAY → return ทันที |
| `testSkipChildrenSkipsNestedStructure` | `skipChildren()`: loop นับ `open` ผ่าน `isStructStart()`/`isStructEnd()` |
| `testScalarValueAccessorsDelegate` | delegation ของ getIntValue/getLongValue/getText |
| `testLocationDelegation` | delegation ของ getCurrentLocation/getTokenLocation |

**หมายเหตุสำคัญ:** เทสในกลุ่มข้อ 9–12 (null filter, filterStartArray/Object คืน null, field filter) พึ่งพา behavior ของ `TokenFilter`/`TokenFilterContext` ที่ไม่มีซอร์สโค้ดให้มา จึงมีคอมเมนต์ระบุ assumption ไว้ในโค้ดแต่ละจุดตามข้อกำหนดที่ 4 ส่วนเทสในกลุ่มข้อ 6–8, 13–17 อาศัยเฉพาะ `TokenFilter.INCLUDE_ALL` และ logic ที่อ่านได้ตรงจาก CUT เท่านั้น จึงมีความน่าเชื่อถือสูงสุด