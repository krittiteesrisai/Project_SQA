package com.fasterxml.jackson.core.util;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence; // ตามข้อกำหนด (redundant แต่ถูกต้องตาม syntax)

public class JsonParserSequenceTest
{
    private static final JsonFactory FACTORY = new JsonFactory();

    private static JsonParser parserFor(String content) throws IOException {
        return FACTORY.createParser(content);
    }

    // =====================================================================
    // 1. createFlattened(): branch "neither is Sequence" -> simple case
    // =====================================================================
    @Test
    public void testCreateFlattened_neitherIsSequence_createsSimpleTwoElementSequence() throws IOException {
        JsonParser p1 = parserFor("1");
        JsonParser p2 = parserFor("2");

        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        assertEquals(2, seq.containedParsersCount());
        assertSame(p1, seq._parsers[0]);
        assertSame(p2, seq._parsers[1]);
        assertEquals(1, seq._nextParser); // initial state ตาม constructor
        assertSame(p1, seq.delegate);     // delegate เริ่มต้นคือ parser แรก
    }

    // =====================================================================
    // 2. createFlattened(): branch "first is Sequence, second is not"
    //    ครอบคลุมการ flatten (fully-active, _nextParser=1 ของ inner)
    // =====================================================================
    @Test
    public void testCreateFlattened_firstIsSequence_secondIsNot_flattensFully() throws IOException {
        JsonParser p1 = parserFor("1");
        JsonParser p2 = parserFor("2");
        JsonParser p3 = parserFor("3");

        JsonParserSequence inner = JsonParserSequence.createFlattened(p1, p2); // _nextParser=1 (ยัง active ทั้งคู่)
        JsonParserSequence outer = JsonParserSequence.createFlattened(inner, p3);

        // ต้อง flatten เป็น 3 parser เดี่ยว ไม่ใช่ nested sequence
        assertEquals(3, outer.containedParsersCount());
        assertSame(p1, outer._parsers[0]);
        assertSame(p2, outer._parsers[1]);
        assertSame(p3, outer._parsers[2]);
    }

    // =====================================================================
    // 3. createFlattened(): branch "second is Sequence, first is not"
    // =====================================================================
    @Test
    public void testCreateFlattened_secondIsSequence_firstIsNot_flattensFully() throws IOException {
        JsonParser p1 = parserFor("1");
        JsonParser p2 = parserFor("2");
        JsonParser p3 = parserFor("3");

        JsonParserSequence inner = JsonParserSequence.createFlattened(p2, p3);
        JsonParserSequence outer = JsonParserSequence.createFlattened(p1, inner);

        assertEquals(3, outer.containedParsersCount());
        assertSame(p1, outer._parsers[0]);
        assertSame(p2, outer._parsers[1]);
        assertSame(p3, outer._parsers[2]);
    }

    // =====================================================================
    // 4. createFlattened(): branch "ทั้งสองเป็น Sequence"
    // =====================================================================
    @Test
    public void testCreateFlattened_bothAreSequences_flattensFully() throws IOException {
        JsonParser p1 = parserFor("1");
        JsonParser p2 = parserFor("2");
        JsonParser p3 = parserFor("3");
        JsonParser p4 = parserFor("4");

        JsonParserSequence left = JsonParserSequence.createFlattened(p1, p2);
        JsonParserSequence right = JsonParserSequence.createFlattened(p3, p4);
        JsonParserSequence outer = JsonParserSequence.createFlattened(left, right);

        assertEquals(4, outer.containedParsersCount());
        assertSame(p1, outer._parsers[0]);
        assertSame(p2, outer._parsers[1]);
        assertSame(p3, outer._parsers[2]);
        assertSame(p4, outer._parsers[3]);
    }

    // =====================================================================
    // 5. createFlattened(): กรณี first/second เป็น null แต่ไม่ถือเป็น Sequence
    //    ("null instanceof X" == false เสมอ) -> ยังเข้า branch simple case ได้
    //    (สรุปตาม logic จริงของ instanceof ใน Java ไม่ได้เดา behavior เพิ่ม)
    // =====================================================================
    @Test
    public void testCreateFlattened_nullFirstParser_stillGoesSimpleBranch() {
        try {
            JsonParserSequence.createFlattened(null, parserFor("1"));
            fail("คาดว่าจะเกิด NullPointerException เนื่องจาก super(parsers[0]) ได้รับ null");
        } catch (NullPointerException expected) {
            // ตาม logic: !(null instanceof Seq || p2 instanceof Seq) == true
            // -> new JsonParserSequence(new JsonParser[]{null, p2})
            // -> super(parsers[0]) คือ super(null) ทำให้เกิด NPE เมื่อพยายามใช้งาน delegate
        } catch (IOException e) {
            fail("ไม่คาดว่าจะเกิด IOException: " + e);
        }
    }

    // =====================================================================
    // 6. Constructor boundary: array ว่าง -> parsers[0] เข้าถึงไม่ได้
    // =====================================================================
    @Test
    public void testConstructor_emptyArray_throwsArrayIndexOutOfBounds() {
        try {
            new JsonParserSequence(new JsonParser[0]);
            fail("คาดว่าจะเกิด ArrayIndexOutOfBoundsException จาก super(parsers[0])");
        } catch (ArrayIndexOutOfBoundsException expected) {
            // ถูกต้องตาม source: parsers[0] ถูกอ้างถึงใน constructor ทันที
        }
    }

    // =====================================================================
    // 7. addFlattenedActiveParsers(): recursive branch (p instanceof Sequence)
    //    โดยสร้าง nested sequence ตรงๆผ่าน protected constructor (bypass การ flatten อัตโนมัติ)
    // =====================================================================
    @Test
    public void testAddFlattenedActiveParsers_recursiveNestedSequence_fullyActive() throws IOException {
        JsonParser pA = parserFor("1");
        JsonParser pB = parserFor("2");
        JsonParser pC = parserFor("3");

        JsonParserSequence nested = new JsonParserSequence(new JsonParser[] { pA, pB }); // _nextParser=1 (active ทั้งคู่)
        JsonParserSequence outer = new JsonParserSequence(new JsonParser[] { nested, pC });

        List<JsonParser> result = new ArrayList<JsonParser>();
        outer.addFlattenedActiveParsers(result);

        assertEquals(3, result.size());
        assertSame(pA, result.get(0));
        assertSame(pB, result.get(1));
        assertSame(pC, result.get(2));
    }

    // =====================================================================
    // 8. addFlattenedActiveParsers(): กรณี nested sequence ถูก "consume" ไปแล้วบางส่วน
    //    ทดสอบ offset (_nextParser - 1) ว่าตัวที่ inactive แล้วจะไม่ถูกรวม
    // =====================================================================
    @Test
    public void testAddFlattenedActiveParsers_partiallyConsumedNestedSequence_excludesConsumed() throws IOException {
        JsonParser pA = parserFor("");  // ไม่มี token -> ทำให้ switchToNext ถูกเรียกทันที
        JsonParser pB = parserFor("2");
        JsonParser pC = parserFor("3");

        JsonParserSequence nested = new JsonParserSequence(new JsonParser[] { pA, pB });
        // เรียก nextToken หนึ่งครั้ง: pA คืน null -> switchToNext ทำให้ _nextParser=2, delegate=pB
        JsonToken t = nested.nextToken();
        assertNotNull(t); // ควรได้ token จาก pB แล้ว
        assertEquals(2, nested._nextParser);

        JsonParserSequence outer = new JsonParserSequence(new JsonParser[] { nested, pC });

        List<JsonParser> result = new ArrayList<JsonParser>();
        outer.addFlattenedActiveParsers(result);

        // pA ถูก "ใช้ไปแล้ว" (ไม่ active) ตาม offset _nextParser-1=1 จึงไม่ถูกรวม
        assertEquals(2, result.size());
        assertSame(pB, result.get(0));
        assertSame(pC, result.get(1));
    }

    // =====================================================================
    // 9. nextToken(): branch "t != null" (คืน token จาก delegate แรกได้ทันที)
    // =====================================================================
    @Test
    public void testNextToken_firstDelegateHasToken_returnsWithoutSwitching() throws IOException {
        JsonParser p1 = parserFor("1");
        JsonParser p2 = parserFor("2");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        JsonToken t = seq.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
        assertEquals(1, seq.getIntValue());
        assertEquals(1, seq._nextParser); // ยังไม่ switch
    }

    // =====================================================================
    // 10. nextToken(): branch while(switchToNext()) ทำงาน (delegate แรก exhausted)
    //     และครอบคลุม boundary จนกระทั่ง return null สุดท้าย
    // =====================================================================
    @Test
    public void testNextToken_switchesAcrossParsers_thenReturnsNullAtEnd() throws IOException {
        JsonParser p1 = parserFor("1");
        JsonParser p2 = parserFor("2");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        JsonToken t1 = seq.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t1);
        assertEquals(1, seq.getIntValue());

        // p1 exhausted -> ต้อง switch ไป p2
        JsonToken t2 = seq.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t2);
        assertEquals(2, seq.getIntValue());
        assertEquals(2, seq._nextParser);

        // p2 exhausted -> switchToNext คืน false -> return null
        JsonToken t3 = seq.nextToken();
        assertNull(t3);
        assertEquals(2, seq._nextParser); // ถึง boundary แล้ว ไม่ขยับต่อ
    }

    // =====================================================================
    // 11. nextToken(): กรณี parser แรก "ว่าง" ตั้งแต่ต้น (คืน null ทันที)
    //     ต้อง skip ไป parser ถัดไปใน while loop
    // =====================================================================
    @Test
    public void testNextToken_emptyFirstParser_skipsToNext() throws IOException {
        JsonParser p1 = parserFor(""); // สมมติฐาน: nextToken() คืน null ทันที (ตาม comment บนสุดของไฟล์)
        JsonParser p2 = parserFor("42");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        JsonToken t = seq.nextToken();
        assertEquals(JsonToken.VALUE_NUMBER_INT, t);
        assertEquals(42, seq.getIntValue());
    }

    // =====================================================================
    // 12. switchToNext(): branch true (ยังมี parser เหลือ) และ branch false (boundary)
    // =====================================================================
    @Test
    public void testSwitchToNext_trueThenFalseAtBoundary() throws IOException {
        JsonParser p1 = parserFor("1");
        JsonParser p2 = parserFor("2");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        assertEquals(1, seq._nextParser);
        boolean switched1 = seq.switchToNext();
        assertTrue(switched1);
        assertSame(p2, seq.delegate);
        assertEquals(2, seq._nextParser);

        // _nextParser (2) >= _parsers.length (2) -> boundary false
        boolean switched2 = seq.switchToNext();
        assertFalse(switched2);
        assertSame(p2, seq.delegate); // delegate ไม่เปลี่ยนอีก
        assertEquals(2, seq._nextParser);
    }

    // =====================================================================
    // 13. close(): do-while loop วิ่งครบทุก parser (หลายตัว)
    // =====================================================================
    @Test
    public void testClose_closesAllUnderlyingParsersInSequence() throws IOException {
        JsonParser p1 = parserFor("1");
        JsonParser p2 = parserFor("2");
        JsonParser p3 = parserFor("3");

        JsonParserSequence seq = JsonParserSequence.createFlattened(
                JsonParserSequence.createFlattened(p1, p2), p3);

        assertFalse(p1.isClosed());
        assertFalse(p2.isClosed());
        assertFalse(p3.isClosed());

        seq.close();

        assertTrue(p1.isClosed());
        assertTrue(p2.isClosed());
        assertTrue(p3.isClosed());
        assertEquals(seq._parsers.length, seq._nextParser); // ถึง boundary หลัง loop จบ
    }

    // =====================================================================
    // 14. close(): boundary กรณี array มี parser เดียว
    //     (do-while ต้อง execute body อย่างน้อย 1 ครั้งแม้ switchToNext() จะ false ทันที)
    // =====================================================================
    @Test
    public void testClose_singleParser_doWhileExecutesOnce() throws IOException {
        JsonParser p1 = parserFor("1");
        JsonParserSequence seq = new JsonParserSequence(new JsonParser[] { p1 });

        assertFalse(p1.isClosed());
        seq.close();
        assertTrue(p1.isClosed());
        // _nextParser(1) >= length(1) ทำให้ switchToNext คืน false ตั้งแต่รอบแรก
        assertEquals(1, seq._nextParser);
    }

    // =====================================================================
    // 15. containedParsersCount(): ค่าตรงกับจำนวน parser จริงทั้งหมด (ไม่ใช่แค่ที่เหลือ active)
    // =====================================================================
    @Test
    public void testContainedParsersCount_reflectsTotalNotJustActive() throws IOException {
        JsonParser p1 = parserFor("1");
        JsonParser p2 = parserFor("2");
        JsonParserSequence seq = JsonParserSequence.createFlattened(p1, p2);

        seq.nextToken(); // ยังไม่ switch
        seq.nextToken(); // ตอนนี้ exhausted p1 -> switch ไป p2 แล้ว (_nextParser=2)

        // แม้ parser จะ "active" เหลือ 0 ตัวจริงๆ แต่ containedParsersCount ต้องคงเป็นจำนวนรวมทั้งหมด (2)
        assertEquals(2, seq.containedParsersCount());
    }
}
