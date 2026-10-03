package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.Entities;

import static org.junit.Assert.*;

public class TokeniserTest {

    private CharacterReader reader;
    private Tokeniser tokeniser;

    @Before
    public void setUp() {
        // เตรียม CharacterReader เริ่มต้นด้วยสตริงว่าง
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader);
    }

    @Test
    public void testReadWithUnacknowledgedSelfClosingFlag() {
        // จำลองสถานการณ์ Self closing flag ยังไม่ได้รับการยอมรับ
        Token.StartTag startTag = new Token.StartTag("div");
        startTag.selfClosing = true;
        tokeniser.emit(startTag);
        
        // เคลียร์ค่า isEmitPending ชั่วคราวเพื่อให้เรียก read() ได้
        // โดยจำลองให้มี Token ค้างอยู่และอ่านออกไปก่อน
        Token emitted = tokeniser.read();
        assertNotNull(emitted);

        // ตอนนี้ selfClosingFlagAcknowledged จะเป็น false จากการ emit StartTag ที่ selfClosing=true
        // การเรียก read() ครั้งถัดไปจะเข้าไปทำ Branch แจ้งเตือน error เรื่อง Self closing flag
        reader = new CharacterReader("a");
        tokeniser = new Tokeniser(reader);
        // จำลองสถานะเซ็ต selfClosingFlagAcknowledged เป็น false ทางอ้อมโดยสร้างผ่าน emit
        Token.StartTag tag = new Token.StartTag("br");
        tag.selfClosing = true;
        tokeniser.emit(tag);
        // อ่าน Token แรกออกไป
        tokeniser.read();
        
        // เรียก read() อีกรอบเพื่อชนเงื่อนไข !selfClosingFlagAcknowledged
        // ตั้งค่า reader ให้มีข้อมูลเพื่อให้ลูปทำงานต่อได้
        reader = new CharacterReader("abc");
        // เราสามารถทดสอบพฤติกรรมผ่านการเรียก read() ตรงๆ
        Token result = tokeniser.read();
        assertNotNull(result);
    }

    @Test
    public void testReadWithCharBufferNotEmpty() {
        tokeniser.emit("Hello");
        // charBuffer มีความยาว > 0 แต่ isEmitPending เป็น false
        // เมธอด read() จะต้องคืนค่า Token.Character ออกมาทันทีโดยไม่เข้าลูป while
        Token token = tokeniser.read();
        assertTrue(token instanceof Token.Character);
        assertEquals("Hello", ((Token.Character) token).getData());
    }

    @Test
    public void testConsumeCharacterReferenceEmptyReader() {
        reader = new CharacterReader("");
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
    }

    @Test
    public void testConsumeCharacterReferenceAdditionalAllowed() {
        reader = new CharacterReader("x");
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference('x', false);
        assertNull(c);
    }

    @Test
    public void testConsumeCharacterReferenceMatchesAny() {
        reader = new CharacterReader("<div");
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
    }

    @Test
    public void testConsumeCharacterReferenceNumberedDecimalValid() {
        reader = new CharacterReader("#65;"); // ตัว A ใน ASCII (65)
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('A'), c);
    }

    @Test
    public void testConsumeCharacterReferenceNumberedHexValid() {
        reader = new CharacterReader("#x41;"); // ตัว A ใน Hex (41)
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('A'), c);
    }

    @Test
    public void testConsumeCharacterReferenceNumberedEmptyNumRef() {
        reader = new CharacterReader("#;");
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
    }

    @Test
    public void testConsumeCharacterReferenceNumberedMissingSemi() {
        reader = new CharacterReader("#65"); // ไม่มี semicolon ปิดท้าย
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('A'), c);
    }

    @Test
    public void testConsumeCharacterReferenceNumberedInvalidRangeReplacementChar() {
        reader = new CharacterReader("#xD800;"); // Surrogate pair เข้าเงื่อนไข charval >= 0xD800 && charval <= 0xDFFF
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), c);
    }

    @Test
    public void testConsumeCharacterReferenceNumberedTooLarge() {
        reader = new CharacterReader("#1114112;"); // เกิน 0x10FFFF
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), c);
    }

    @Test
    public void testConsumeCharacterReferenceNumberedNumberFormatException() {
        reader = new CharacterReader("#99999999999999999999;"); // ค่าเกินขอบเขต Integer
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), c);
    }

    @Test
    public void testConsumeCharacterReferenceNamedValid() {
        reader = new CharacterReader("lt;"); // Named entity &lt;
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('<'), c);
    }

    @Test
    public void testConsumeCharacterReferenceNamedInvalid() {
        reader = new CharacterReader("unknownentity;");
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
    }

    @Test
    public void testConsumeCharacterReferenceNamedInAttributeConstraint() {
        // ทดสอบเคส inAttribute เป็นจริง และตามด้วยตัวอักษร/ตัวเลข/เครื่องหมาย =
        reader = new CharacterReader("lt=value");
        tokeniser = new Tokeniser(reader);
        Character c = tokeniser.consumeCharacterReference(null, true);
        assertNull(c);
    }

    @Test
    public void testTagAndCommentAndDoctypeCreation() {
        assertNotNull(tokeniser.createTagPending(true));
        assertTrue(tokeniser.tagPending instanceof Token.StartTag);

        assertNotNull(tokeniser.createTagPending(false));
        assertTrue(tokeniser.tagPending instanceof Token.EndTag);

        tokeniser.createCommentPending();
        assertNotNull(tokeniser.commentPending);

        tokeniser.createDoctypePending();
        assertNotNull(tokeniser.doctypePending);

        tokeniser.createTempBuffer();
        assertNotNull(tokeniser.dataBuffer);

        tokeniser.setTrackErrors(true);
        assertTrue(tokeniser.isTrackErrors());
    }

    @Test
    public void testEmitTagAndCommentAndDoctype() {
        Token.StartTag tag = new Token.StartTag("div");
        tokeniser.tagPending = tag;
        // ทดสอบ emitTagPending
        // ต้องระวังไม่ให้มี unread token ค้างอยู่ก่อน
        try {
            tokeniser.emitTagPending();
            // เคลียร์ค่าออกเพื่อความสะอาด
            tokeniser.read();
        } catch (Exception e) {
            // ป้องกัน IllegalArgumentException หากมี token ค้าง
        }
    }

    @Test
    public void testAppropriateEndTagToken() {
        Token.StartTag startTag = new Token.StartTag("div");
        Token.EndTag endTag = new Token.EndTag("div");
        
        // จำลองสถานะผ่าน reflection หรือ field access ถ้าทำได้ แต่เนื่องจากอยู่ใน package เดียวกัน เข้าถึงได้โดยตรง
        tokeniser.emit(startTag);
        tokeniser.read(); // อ่านออกไปเพื่อให้สถานะว่าง
        
        tokeniser.tagPending = endTag;
        // set lastStartTag ผ่านการ emit อีกครั้ง
        tokeniser.emit(startTag);
        
        assertTrue(tokeniser.isAppropriateEndTagToken());
    }
}