# วิเคราะห์และข้อจำกัดที่ต้องระบุ (ก่อนโค้ด)

- คลาส `CSVPrinter` พึ่งพา `CSVFormat`, `Quote`, `Constants`, `Assertions` ซึ่งไม่ได้แสดง source มาให้ครบ ผมอ้างอิง API ตาม **ชื่อ getter ที่ปรากฏในซอร์ส** (`getDelimiter`, `getQuoteChar`, `getEscape`, `getCommentStart`, `getQuotePolicy`, `getNullString`, `getRecordSeparator`, `isQuoting`, `isEscaping`, `isCommentingEnabled`) และสมมติว่ามี `with...` methods คู่กันตามธรรมเนียมของ commons-csv (`withDelimiter`, `withQuoteChar`, `withQuotePolicy`, `withEscape`, `withCommentStart`, `withRecordSeparator`, `withNullString`) และ factory `CSVFormat.DEFAULT` / `CSVFormat.newFormat(char)` — **หากชื่อเมธอดจริงต่างจากนี้ ให้แก้เฉพาะชื่อเมธอด logic การเทสยังใช้ได้เหมือนเดิม** (คอมเมนต์ไว้ในโค้ด)
- ค่า `Constants.COMMENT='#'`, `Constants.SP=' '`, `CR='\r'`, `LF='\n'` เป็นค่าที่คาดว่าใช้ตามมาตรฐาน ASCII ซึ่งสอดคล้องกับพฤติกรรมทั่วไปของไลบรารีนี้ — คอมเมนต์กำกับไว้เพราะไม่มีซอร์สของ Constants ให้ตรวจสอบ
- ไม่ทดสอบ `format.validate()` กรณี invalid เพราะไม่มีซอร์ส validate() ให้ดู (หลีกเลี่ยงการเดา)

```java
package org.apache.commons.csv;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.StringWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CSVPrinterTest {

    private StringBuilder sb;

    @Before
    public void setUp() {
        sb = new StringBuilder();
    }

    // ---------- Constructor ----------

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullOut() {
        new CSVPrinter(null, CSVFormat.DEFAULT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFormat() {
        new CSVPrinter(sb, null);
    }

    @Test
    public void testGetOutReturnsSameInstance() throws Exception {
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        assertSame(sb, printer.getOut());
    }

    // ---------- close()/flush() branch: instanceof Closeable/Flushable ----------

    @Test
    public void testCloseFlush_NonCloseableNonFlushable() throws Exception {
        // StringBuilder ไม่ implement Closeable/Flushable -> ทั้งสอง if เป็น false
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.close();
        printer.flush();
        // ไม่ throw = ผ่าน
    }

    @Test
    public void testCloseFlush_CloseableFlushable() throws Exception {
        // StringWriter implements Closeable & Flushable -> ทั้งสอง if เป็น true
        StringWriter sw = new StringWriter();
        CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);
        printer.flush();
        printer.close();
    }

    // ---------- print(Object) : null handling ----------

    @Test
    public void testPrintNull_DefaultNullString_QuotingEnabled_FirstField() throws Exception {
        // nullString == null -> strValue = "" ; MINIMAL policy, len<=0 && newRecord -> quote=true
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print(null);
        assertEquals("\"\"", sb.toString());
    }

    @Test
    public void testPrintNull_WithNullString_MinimalNoQuoteNeeded() throws Exception {
        CSVFormat fmt = CSVFormat.DEFAULT.withNullString("NULL");
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print(null);
        assertEquals("NULL", sb.toString());
    }

    @Test
    public void testPrintNull_PlainFormat_EmptyThenDelimiterBranch() throws Exception {
        // format ไม่ quote ไม่ escape -> เข้า else: out.append(value,offset,offset+len)
        CSVFormat fmt = CSVFormat.newFormat(',');
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print(null); // newRecord=true -> ไม่ prepend delimiter, ค่า ""
        printer.print("x");  // newRecord=false -> prepend delimiter ','
        assertEquals(",x", sb.toString());
    }

    // ---------- printAndQuote : Quote.ALL / NON_NUMERIC / NONE ----------

    @Test
    public void testQuoteAll() throws Exception {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuotePolicy(Quote.ALL);
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print("abc");
        assertEquals("\"abc\"", sb.toString());
    }

    @Test
    public void testQuoteNonNumeric_WithNumber_NoQuote() throws Exception {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC);
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print(Integer.valueOf(5));
        assertEquals("5", sb.toString());
    }

    @Test
    public void testQuoteNonNumeric_WithString_Quote() throws Exception {
        CSVFormat fmt = CSVFormat.DEFAULT.withQuotePolicy(Quote.NON_NUMERIC);
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print("hello");
        assertEquals("\"hello\"", sb.toString());
    }

    @Test
    public void testQuoteNone_DelegatesToPrintAndEscape() throws Exception {
        // isQuoting=true, quotePolicy=NONE -> เข้า case NONE -> เรียก printAndEscape แล้ว return ทันที (ไม่ห่อ quote)
        CSVFormat fmt = CSVFormat.DEFAULT
                .withQuotePolicy(Quote.NONE)
                .withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print("a,b");
        assertEquals("a\\,b", sb.toString());
    }

    // ---------- printAndQuote : MINIMAL - boundary/condition ----------

    @Test
    public void testMinimal_EmptyValue_FirstField_Quoted() throws Exception {
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("");
        assertEquals("\"\"", sb.toString());
    }

    @Test
    public void testMinimal_EmptyValue_NotFirstField_NoQuote() throws Exception {
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("a");
        printer.print("");
        assertEquals("a,", sb.toString());
    }

    @Test
    public void testMinimal_FirstChar_LessThanZero_TriggersQuote() throws Exception {
        // '!' (33) < '0' (48) -> newRecord && c<'0' -> quote=true
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("!abc");
        assertEquals("\"!abc\"", sb.toString());
    }

    @Test
    public void testMinimal_FirstChar_BetweenNineAndA_TriggersQuote() throws Exception {
        // ':' (58) > '9'(57) && < 'A'(65)
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print(":abc");
        assertEquals("\":abc\"", sb.toString());
    }

    @Test
    public void testMinimal_FirstChar_BetweenZAndA_TriggersQuote() throws Exception {
        // '[' (91) > 'Z'(90) && < 'a'(97)
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("[abc");
        assertEquals("\"[abc\"", sb.toString());
    }

    @Test
    public void testMinimal_FirstChar_GreaterThanZ_TriggersQuote() throws Exception {
        // '{' (123) > 'z' (122)
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("{abc");
        assertEquals("\"{abc\"", sb.toString());
    }

    @Test
    public void testMinimal_FirstChar_ValidAlnum_NoTriggerFromCond1() throws Exception {
        // 'h' อยู่ในช่วงปกติ ไม่ผ่าน cond1, ไม่ <=COMMENT, ไม่มี special ในสตริง, ท้ายไม่ <=SP -> ไม่ quote
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("hello");
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testMinimal_CommentCharAtStart_NotFirstField_TriggersQuote() throws Exception {
        // newRecord=false ตอนพิมพ์ field ที่ 2 -> cond1 เป็น false เสมอ (newRecord&&...) ไปตรวจ c<=COMMENT('#')
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("a");
        printer.print("#test");
        assertEquals("a,\"#test\"", sb.toString());
    }

    @Test
    public void testMinimal_DelimiterInsideValue_TriggersQuote() throws Exception {
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("ab,cd");
        assertEquals("\"ab,cd\"", sb.toString());
    }

    @Test
    public void testMinimal_LFInsideValue_TriggersQuote_PreservesRawChar() throws Exception {
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("ab\ncd");
        assertEquals("\"ab\ncd\"", sb.toString());
    }

    @Test
    public void testMinimal_EmbeddedQuoteChar_DoublesQuote() throws Exception {
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("a\"b");
        assertEquals("\"a\"\"b\"", sb.toString());
    }

    @Test
    public void testMinimal_TrailingCharLessEqualSP_TriggersQuote() throws Exception {
        // ตัวสุดท้าย ' ' (32) <= SP(32) -> quote=true
        CSVPrinter printer = new CSVPrinter(sb, CSVFormat.DEFAULT);
        printer.print("ab ");
        assertEquals("\"ab \"", sb.toString());
    }

    // ---------- printAndEscape (isEscaping=true, isQuoting=false) ----------

    @Test
    public void testEscape_DelimiterCRLFAndEscapeChar() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print("a,b");
        assertEquals("a\\,b", sb.toString());
    }

    @Test
    public void testEscape_LF() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print("a\nb");
        assertEquals("a\\nb", sb.toString());
    }

    @Test
    public void testEscape_CR() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print("a\rb");
        assertEquals("a\\rb", sb.toString());
    }

    @Test
    public void testEscape_EscapeCharItself() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print("a\\b");
        assertEquals("a\\\\b", sb.toString());
    }

    @Test
    public void testEscape_NoSpecialChar_PlainOutput() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\');
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print("abc");
        assertEquals("abc", sb.toString());
    }

    // ---------- printComment ----------

    @Test
    public void testPrintComment_Disabled_NoOutput() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',');
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.printComment("hello");
        assertEquals("", sb.toString());
    }

    @Test
    public void testPrintComment_Enabled_FirstRecord() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',')
                .withCommentStart('#')
                .withRecordSeparator("\r\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.printComment("hello");
        assertEquals("# hello\r\n", sb.toString());
    }

    @Test
    public void testPrintComment_NotFirstRecord_CallsPrintlnFirst() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',')
                .withCommentStart('#')
                .withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.print("x");
        printer.printComment("hi");
        // newRecord=false ก่อนเรียก printComment -> เรียก println() ก่อนพิมพ์ comment
        assertEquals("x\n# hi\n", sb.toString());
    }

    @Test
    public void testPrintComment_LF_SplitsLines() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',')
                .withCommentStart('#')
                .withRecordSeparator("\r\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.printComment("line1\nline2");
        assertEquals("# line1\r\n# line2\r\n", sb.toString());
    }

    @Test
    public void testPrintComment_CRLF_TreatedAsSingleNewline() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',')
                .withCommentStart('#')
                .withRecordSeparator("\r\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.printComment("line1\r\nline2");
        assertEquals("# line1\r\n# line2\r\n", sb.toString());
    }

    @Test
    public void testPrintComment_CROnly_FallThrough() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',')
                .withCommentStart('#')
                .withRecordSeparator("\r\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.printComment("line1\rline2");
        assertEquals("# line1\r\n# line2\r\n", sb.toString());
    }

    // ---------- println() ----------

    @Test
    public void testPrintln_AppendsSeparator_ResetsNewRecord() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.println();
        assertEquals("\n", sb.toString());
        // newRecord ควรกลับเป็น true -> print ครั้งต่อไปไม่ควร prepend delimiter
        printer.print("x");
        assertEquals("\nx", sb.toString());
    }

    // ---------- printRecord(Iterable) / printRecord(Object...) ----------

    @Test
    public void testPrintRecord_Iterable() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        List<String> values = Arrays.asList("a", "b", "c");
        printer.printRecord(values);
        assertEquals("a,b,c\n", sb.toString());
    }

    @Test
    public void testPrintRecord_Varargs() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.printRecord("a", "b", "c");
        assertEquals("a,b,c\n", sb.toString());
    }

    @Test
    public void testPrintRecord_EscapeFormat_MultipleFields() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withEscape('\\').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);
        printer.printRecord("a,b", "c");
        assertEquals("a\\,b,c\n", sb.toString());
    }

    // ---------- printRecords(Iterable) : nested branches ----------

    @Test
    public void testPrintRecords_Iterable_NestedArrayIterableAndPlain() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);

        Object arrayItem = new Object[] { "x", "y" };
        Object iterableItem = Arrays.asList("p", "q");
        Object plainItem = "z";

        List<Object> outer = Arrays.asList(arrayItem, iterableItem, plainItem);
        printer.printRecords(outer);

        assertEquals("x,y\np,q\nz\n", sb.toString());
    }

    // ---------- printRecords(Object[]) : nested branches ----------

    @Test
    public void testPrintRecords_ObjectArray_NestedArrayIterableAndPlain() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);

        Object[] outer = new Object[] {
                new Object[] { "x", "y" },
                Arrays.asList("p", "q"),
                "z"
        };
        printer.printRecords(outer);

        assertEquals("x,y\np,q\nz\n", sb.toString());
    }

    // ---------- printRecords(ResultSet) ----------

    @Test
    public void testPrintRecords_ResultSet_TwoRowsTwoColumns() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);

        ResultSet rs = mock(ResultSet.class);
        ResultSetMetaData md = mock(ResultSetMetaData.class);
        when(rs.getMetaData()).thenReturn(md);
        when(md.getColumnCount()).thenReturn(2);
        when(rs.next()).thenReturn(true, true, false);
        when(rs.getString(1)).thenReturn("r1c1", "r2c1");
        when(rs.getString(2)).thenReturn("r1c2", "r2c2");

        printer.printRecords(rs);

        assertEquals("r1c1,r1c2\nr2c1,r2c2\n", sb.toString());
    }

    @Test
    public void testPrintRecords_ResultSet_NoRows() throws Exception {
        CSVFormat fmt = CSVFormat.newFormat(',').withRecordSeparator("\n");
        CSVPrinter printer = new CSVPrinter(sb, fmt);

        ResultSet rs = mock(ResultSet.class);
        ResultSetMetaData md = mock(ResultSetMetaData.class);
        when(rs.getMetaData()).thenReturn(md);
        when(md.getColumnCount()).thenReturn(1);
        when(rs.next()).thenReturn(false);

        printer.printRecords(rs);

        assertEquals("", sb.toString());
    }
}
```

# ตารางสรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructorNullOut / testConstructorNullFormat | `Assertions.notNull` throw กรณี out/format = null |
| testGetOutReturnsSameInstance | getOut() คืน reference เดิม |
| testCloseFlush_NonCloseableNonFlushable | `instanceof Closeable/Flushable` = false ทั้งสองจุด |
| testCloseFlush_CloseableFlushable | `instanceof Closeable/Flushable` = true ทั้งสองจุด |
| testPrintNull_DefaultNullString_QuotingEnabled_FirstField | print(null): nullString==null, len<=0 && newRecord=true → quote |
| testPrintNull_WithNullString_MinimalNoQuoteNeeded | print(null): nullString!=null, MINIMAL ไม่ต้อง quote |
| testPrintNull_PlainFormat_EmptyThenDelimiterBranch | else-branch (ไม่ quote/escape), `!newRecord` true/false |
| testQuoteAll | switch-case ALL |
| testQuoteNonNumeric_WithNumber_NoQuote / _WithString_Quote | switch-case NON_NUMERIC ทั้ง true/false ของ `instanceof Number` |
| testQuoteNone_DelegatesToPrintAndEscape | switch-case NONE → printAndEscape + return |
| testMinimal_EmptyValue_FirstField_Quoted | MINIMAL: len<=0 && newRecord=true |
| testMinimal_EmptyValue_NotFirstField_NoQuote | MINIMAL: len<=0 && newRecord=false |
| testMinimal_FirstChar_* (4 methods) | เงื่อนไข OR หลายช่วงของ cond1 (`c<'0'`, `'9'<c<'A'`, `'Z'<c<'a'`, `c>'z'`) |
| testMinimal_FirstChar_ValidAlnum_NoTriggerFromCond1 | cond1=false, path ปกติไม่ quote |
| testMinimal_CommentCharAtStart_NotFirstField_TriggersQuote | else-if `c<=COMMENT` เมื่อ newRecord=false |
| testMinimal_DelimiterInsideValue_TriggersQuote | inner while: match delimChar |
| testMinimal_LFInsideValue_TriggersQuote_PreservesRawChar | inner while: match LF, เก็บ raw char ในโหมด quote |
| testMinimal_EmbeddedQuoteChar_DoublesQuote | inner while match quoteChar + double-quote algorithm |
| testMinimal_TrailingCharLessEqualSP_TriggersQuote | `c<=SP` ตัวสุดท้าย |
| testEscape_* (5 methods) | printAndEscape: CR/LF/delim/escape-char/ไม่มี special |
| testPrintComment_Disabled_NoOutput | `isCommentingEnabled()==false` → return ทันที |
| testPrintComment_Enabled_FirstRecord | `!newRecord` = false (ไม่เรียก println ก่อน) |
| testPrintComment_NotFirstRecord_CallsPrintlnFirst | `!newRecord` = true (เรียก println ก่อน) |
| testPrintComment_LF_SplitsLines | case LF ใน for-loop |
| testPrintComment_CRLF_TreatedAsSingleNewline | case CR ที่ตามด้วย LF (skip i++) fallthrough |
| testPrintComment_CROnly_FallThrough | case CR ที่ไม่ตามด้วย LF fallthrough |
| testPrintln_AppendsSeparator_ResetsNewRecord | println() ปกติ + reset newRecord |
| testPrintRecord_Iterable / _Varargs | printRecord(Iterable) และ printRecord(Object...) loop |
| testPrintRecord_EscapeFormat_MultipleFields | ผสม delimiter-prepend + escape หลาย field |
| testPrintRecords_Iterable_NestedArrayIterableAndPlain | printRecords(Iterable): 3 branch (Object[]/Iterable/plain) |
| testPrintRecords_ObjectArray_NestedArrayIterableAndPlain | printRecords(Object[]): 3 branch เดียวกัน |
| testPrintRecords_ResultSet_TwoRowsTwoColumns | printRecords(ResultSet): while(next) loop + for(column) loop |
| testPrintRecords_ResultSet_NoRows | printRecords(ResultSet): while(next) = false ทันที |

**หมายเหตุ:** หากชื่อ method ของ `CSVFormat`/`Quote` ในซอร์สจริงต่างจากที่ใช้ (เช่น `withQuoteChar` เป็น `withQuote`) ให้ปรับเฉพาะชื่อเมธอด logic การทดสอบยังคงถูกต้องตาม branch ที่วิเคราะห์จาก `CSVPrinter` ที่ให้มา