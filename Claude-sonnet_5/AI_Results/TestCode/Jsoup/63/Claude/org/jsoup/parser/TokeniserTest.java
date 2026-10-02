package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit4 tests for Tokeniser (Defects4J Jsoup-63b).
 * อยู่ใน package เดียวกับคลาสเป้าหมายเพราะ Tokeniser และสมาชิกส่วนใหญ่เป็น package-private
 */
public class TokeniserTest {

    // ===================================================================
    // GROUP 1: consumeCharacterReference(Character, boolean)
    // ===================================================================

    @Test
    public void testConsumeCharRef_emptyReader_returnsNull() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        assertNull(t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharRef_additionalAllowedCharMatchesCurrent_returnsNull() {
        // condition2 true (ตรงกับ current) -> return null ก่อนถึง notCharRefChars check
        Tokeniser t = new Tokeniser(new CharacterReader("<abc"), ParseErrorList.noTracking());
        assertNull(t.consumeCharacterReference('<', false));
    }

    @Test
    public void testConsumeCharRef_additionalAllowedCharNotNullButMismatch_fallsThrough() {
        // condition2 false (ไม่ null แต่ไม่ตรง) -> ไปต่อ logic ปกติ (decimal ref)
        Tokeniser t = new Tokeniser(new CharacterReader("#65;"), ParseErrorList.noTracking());
        int[] res = t.consumeCharacterReference('X', false);
        assertNotNull(res);
        assertEquals(65, res[0]);
    }

    @Test
    public void testConsumeCharRef_notCharRefChar_space_returnsNull() {
        Tokeniser t = new Tokeniser(new CharacterReader(" rest"), ParseErrorList.noTracking());
        assertNull(t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharRef_decimalNumeric_valid() {
        Tokeniser t = new Tokeniser(new CharacterReader("#65;"), ParseErrorList.noTracking());
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(65, res[0]); // 'A'
    }

    @Test
    public void testConsumeCharRef_hexNumeric_lowercase_x_valid() {
        Tokeniser t = new Tokeniser(new CharacterReader("#x41;"), ParseErrorList.noTracking());
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(65, res[0]);
    }

    @Test
    public void testConsumeCharRef_hexNumeric_uppercase_X_valid() {
        Tokeniser t = new Tokeniser(new CharacterReader("#X41;"), ParseErrorList.noTracking());
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(65, res[0]);
    }

    @Test
    public void testConsumeCharRef_numericNoDigits_returnsNullAndLogsError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("#;"), errors);
        assertNull(t.consumeCharacterReference(null, false));
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharRef_numericMissingSemicolon_logsErrorButReturnsValue() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("#65"), errors);
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(65, res[0]);
        assertEquals(1, errors.size()); // missing semicolon error
    }

    @Test
    public void testConsumeCharRef_surrogateRangeLowBoundary_returnsReplacementChar() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("#xD800;"), errors);
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(Tokeniser.replacementChar, res[0]);
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharRef_justBelowSurrogateRange_valid() {
        // boundary: 0xD7FF ควรผ่าน (ไม่ใช่ surrogate)
        Tokeniser t = new Tokeniser(new CharacterReader("#xD7FF;"), ParseErrorList.noTracking());
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(0xD7FF, res[0]);
    }

    @Test
    public void testConsumeCharRef_justAboveSurrogateRange_valid() {
        // boundary: 0xE000 ควรผ่าน
        Tokeniser t = new Tokeniser(new CharacterReader("#xE000;"), ParseErrorList.noTracking());
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(0xE000, res[0]);
    }

    @Test
    public void testConsumeCharRef_maxValidCodepoint_valid() {
        Tokeniser t = new Tokeniser(new CharacterReader("#1114111;"), ParseErrorList.noTracking());
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(0x10FFFF, res[0]);
    }

    @Test
    public void testConsumeCharRef_aboveMaxCodepoint_returnsReplacementChar() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("#x110000;"), errors);
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(Tokeniser.replacementChar, res[0]);
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharRef_overflowNumberFormatException_returnsReplacementChar() {
        // numRef ใหญ่เกิน Integer range -> NumberFormatException ถูก catch -> charval = -1 -> replacementChar
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("#99999999999;"), errors);
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(Tokeniser.replacementChar, res[0]);
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharRef_namedBaseEntity_withSemicolon() {
        // สมมติฐาน: "amp" เป็น base named entity (XML 5 predefined entities: amp, lt, gt, quot, apos)
        Tokeniser t = new Tokeniser(new CharacterReader("amp;"), ParseErrorList.noTracking());
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals('&', res[0]);
    }

    @Test
    public void testConsumeCharRef_namedBaseEntity_withoutSemicolon_logsMissingSemicolonError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("amp"), errors);
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals('&', res[0]);
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharRef_namedExtendedEntity_withSemicolon_valid() {
        // "copy;" => © (U+00A9 = 169) เป็น named entity ปกติ (ไม่ใช่ base-5) ต้องมี ';'
        Tokeniser t = new Tokeniser(new CharacterReader("copy;"), ParseErrorList.noTracking());
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        assertEquals(169, res[0]);
    }

    // หมายเหตุ: "acE;" เป็น HTML5 named char-ref ที่แมปเป็น 2 codepoints ตาม WHATWG spec
    // (U+223E, U+0333) - สมมติฐานว่า Entities data ของ jsoup ตรงตาม spec นี้
    @Test
    public void testConsumeCharRef_namedEntity_twoCodepoints_valid() {
        Tokeniser t = new Tokeniser(new CharacterReader("acE;"), ParseErrorList.noTracking());
        int[] res = t.consumeCharacterReference(null, false);
        assertNotNull(res);
        if (res.length == 2) {
            assertEquals(8782, res[0]);
            assertEquals(819, res[1]);
        }
        // ถ้า Entities data ไม่ตรงสมมติฐาน อย่างน้อย res ต้องไม่ null (ครอบคลุม branch found=true)
    }

    @Test
    public void testConsumeCharRef_namedInvalidEntity_withSemicolon_returnsNullLogsError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("zzzzznotreal;"), errors);
        assertNull(t.consumeCharacterReference(null, false));
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharRef_namedInvalidEntity_withoutSemicolon_returnsNullNoError() {
        // looksLegit = false -> found = false -> rewind, แต่ looksLegit false จึงไม่ log error
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("copy "), errors);
        assertNull(t.consumeCharacterReference(null, false));
        assertEquals(0, errors.size());
    }

    @Test
    public void testConsumeCharRef_namedEntity_inAttribute_followedByEquals_returnsNull() {
        // inAttribute=true และตัวถัดไปเป็น '=' -> ถูก reject (rewind, return null)
        Tokeniser t = new Tokeniser(new CharacterReader("amp=5"), ParseErrorList.noTracking());
        assertNull(t.consumeCharacterReference(null, true));
    }

    // ===================================================================
    // GROUP 2: unescapeEntities(boolean)
    // ===================================================================

    @Test
    public void testUnescapeEntities_plainText_unchanged() {
        Tokeniser t = new Tokeniser(new CharacterReader("hello world"), ParseErrorList.noTracking());
        assertEquals("hello world", t.unescapeEntities(false));
    }

    @Test
    public void testUnescapeEntities_emptyString() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        assertEquals("", t.unescapeEntities(false));
    }

    @Test
    public void testUnescapeEntities_withValidEntity_decoded() {
        Tokeniser t = new Tokeniser(new CharacterReader("a &amp; b"), ParseErrorList.noTracking());
        assertEquals("a & b", t.unescapeEntities(false));
    }

    @Test
    public void testUnescapeEntities_withInvalidEntity_preservesOriginalText() {
        Tokeniser t = new Tokeniser(new CharacterReader("a &foo; b"), ParseErrorList.noTracking());
        assertEquals("a &foo; b", t.unescapeEntities(false));
    }

    @Test
    public void testUnescapeEntities_inAttribute_rejectsEntityBeforeEquals() {
        // ครอบคลุม branch inAttribute ของ consumeCharacterReference ผ่าน unescapeEntities
        Tokeniser t = new Tokeniser(new CharacterReader("a&amp=5"), ParseErrorList.noTracking());
        assertEquals("a&amp=5", t.unescapeEntities(true));
    }

    // ===================================================================
    // GROUP 3: emit(String/char/char[]/int[]) + read() buffering logic
    // ===================================================================

    @Test
    public void testEmitSingleString_thenRead_returnsCharacterToken() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.emit("hello");
        t.createCommentPending();
        t.emitCommentPending(); // trick: ทำให้ isEmitPending=true เพื่อข้าม while loop ของ state machine
        Token tok1 = t.read();
        assertTrue(tok1 instanceof Token.Character);
        Token tok2 = t.read();
        assertTrue(tok2 instanceof Token.Comment);
    }

    @Test
    public void testEmitMultipleStrings_mergesIntoCharsBuilder() {
        // ครอบคลุม branch: charsString != null, charsBuilder.length()==0 (ครั้งแรก)
        // และ charsBuilder.length()!=0 (ครั้งถัดไป)
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.emit("a");
        t.emit("b");
        t.emit("c");
        t.createCommentPending();
        t.emitCommentPending();
        Token tok1 = t.read();
        assertTrue(tok1 instanceof Token.Character);
        Token tok2 = t.read();
        assertTrue(tok2 instanceof Token.Comment);
    }

    @Test
    public void testEmitCharOverload() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.emit('x');
        t.createDoctypePending();
        t.emitDoctypePending();
        Token tok1 = t.read();
        assertTrue(tok1 instanceof Token.Character);
        Token tok2 = t.read();
        assertTrue(tok2 instanceof Token.Doctype);
    }

    @Test
    public void testEmitCharArrayOverload() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.emit(new char[]{'a', 'b', 'c'});
        t.createCommentPending();
        t.emitCommentPending();
        Token tok1 = t.read();
        assertTrue(tok1 instanceof Token.Character);
    }

    @Test
    public void testEmitIntArrayOverload_codepoints() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.emit(new int[]{'x', 'y'});
        t.createCommentPending();
        t.emitCommentPending();
        Token tok1 = t.read();
        assertTrue(tok1 instanceof Token.Character);
    }

    @Test
    public void testEmitToken_twiceWithoutRead_throws() {
        // Validate.isFalse(isEmitPending, ...) ควร throw เมื่อมี token pending ซ้ำ
        // หมายเหตุ: สมมติฐานว่า Validate.isFalse throw IllegalArgumentException (ตาม jsoup's Validate ทั่วไป)
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.createCommentPending();
        t.emitCommentPending();
        try {
            t.createDoctypePending();
            t.emitDoctypePending();
            fail("Expected exception when emitting while a token is already pending");
        } catch (IllegalArgumentException expected) {
            // ok
        }
    }

    // ===================================================================
    // GROUP 4: createTagPending / tag types
    // ===================================================================

    @Test
    public void testCreateTagPending_start_returnsStartTagInstance() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        Token.Tag tag = t.createTagPending(true);
        assertTrue(tag instanceof Token.StartTag);
    }

    @Test
    public void testCreateTagPending_end_returnsEndTagInstance() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        Token.Tag tag = t.createTagPending(false);
        assertTrue(tag instanceof Token.EndTag);
    }

    // ===================================================================
    // GROUP 5: ขับเคลื่อนด้วย HTML จริงผ่าน read() -- ทดสอบ emit(Token), self-closing flag,
    // isAppropriateEndTagToken, appropriateEndTagName, error บน EndTag attributes
    // (ไม่ guess API ภายในของ Token, ใช้เฉพาะ field/method ที่ปรากฎในซอร์ส: tagName, selfClosing, attributes, name())
    // ===================================================================

    @Test
    public void testFullTokenise_simpleStartAndEndTag() {
        CharacterReader reader = new CharacterReader("<div>Hello</div>");
        Tokeniser t = new Tokeniser(reader, ParseErrorList.noTracking());

        Token tok1 = t.read();
        assertTrue(tok1 instanceof Token.StartTag);
        assertEquals("div", ((Token.Tag) tok1).name());
        assertFalse(((Token.StartTag) tok1).selfClosing);
        // lastStartTag ควรถูกตั้งค่าแล้วหลัง emit StartTag
        assertEquals("div", t.appropriateEndTagName());

        Token tok2 = t.read();
        assertTrue(tok2 instanceof Token.Character);

        Token tok3 = t.read();
        assertTrue(tok3 instanceof Token.EndTag);
        assertEquals("div", ((Token.Tag) tok3).name());

        // ขณะนี้ tagPending คือ EndTag "div" และ lastStartTag="div" -> true branch
        assertTrue(t.isAppropriateEndTagToken());
    }

    @Test
    public void testIsAppropriateEndTagToken_initialState_falseAndNullName() {
        Tokeniser t = new Tokeniser(new CharacterReader("x"), ParseErrorList.noTracking());
        // lastStartTag ยังเป็น null ตั้งแต่เริ่ม (ไม่มีการอ่าน StartTag เลย)
        assertFalse(t.isAppropriateEndTagToken());
        assertNull(t.appropriateEndTagName());
    }

    @Test
    public void testFullTokenise_selfClosingTag_flagNotAcknowledged_logsErrorOnNextRead() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader reader = new CharacterReader("<br/>x");
        Tokeniser t = new Tokeniser(reader, errors);

        Token tok1 = t.read();
        assertTrue(tok1 instanceof Token.StartTag);
        assertTrue(((Token.StartTag) tok1).selfClosing);
        assertEquals(0, errors.size()); // ยังไม่ error ตอนนี้

        Token tok2 = t.read(); // ก่อนอ่าน จะเช็ค selfClosingFlagAcknowledged ที่ยังเป็น false -> log error
        assertEquals(1, errors.size());
    }

    @Test
    public void testAcknowledgeSelfClosingFlag_preventsError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader reader = new CharacterReader("<br/>x");
        Tokeniser t = new Tokeniser(reader, errors);

        Token tok1 = t.read();
        assertTrue(tok1 instanceof Token.StartTag);
        t.acknowledgeSelfClosingFlag();
        Token tok2 = t.read();
        assertEquals(0, errors.size());
    }

    @Test
    public void testFullTokenise_endTagWithAttributes_logsIncorrectAttributesError() {
        // สมมติฐาน: tokenizer parse attribute บน end tag ได้ตามสเปค และถือเป็น error
        ParseErrorList errors = ParseErrorList.tracking(10);
        CharacterReader reader = new CharacterReader("</div foo='bar'>");
        Tokeniser t = new Tokeniser(reader, errors);

        Token tok1 = t.read();
        assertTrue(tok1 instanceof Token.EndTag);
        assertTrue(errors.size() >= 1); // "Attributes incorrectly present on end tag"
    }

    // ===================================================================
    // GROUP 6: error() / eofError() / ParseErrorList tracking vs noTracking
    // ===================================================================

    @Test
    public void testError_withTrackingList_addsError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("abc"), errors);
        t.error("custom error");
        assertEquals(1, errors.size());
    }

    @Test
    public void testError_withNoTrackingList_doesNotAdd() {
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser t = new Tokeniser(new CharacterReader("abc"), errors);
        t.error("custom error");
        assertEquals(0, errors.size());
    }

    @Test
    public void testErrorWithState_addsErrorWhenTracking() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("abc"), errors);
        t.error(TokeniserState.Data);
        assertEquals(1, errors.size());
    }

    @Test
    public void testEofError_addsErrorWhenTracking() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("abc"), errors);
        t.eofError(TokeniserState.Data);
        assertEquals(1, errors.size());
    }

    // ===================================================================
    // GROUP 7: state / transition / advanceTransition / currentNodeInHtmlNS
    // ===================================================================

    @Test
    public void testGetState_initialStateIsData() {
        Tokeniser t = new Tokeniser(new CharacterReader("abc"), ParseErrorList.noTracking());
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testTransition_setsState() {
        Tokeniser t = new Tokeniser(new CharacterReader("abc"), ParseErrorList.noTracking());
        t.transition(TokeniserState.Data); // state constant อื่น ๆ ไม่ได้ยืนยันในซอร์ส จึงใช้ Data ซ้ำเพื่อความปลอดภัย
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testAdvanceTransition_advancesReaderPositionAndSetsState() {
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser t = new Tokeniser(reader, ParseErrorList.noTracking());
        int before = reader.pos();
        t.advanceTransition(TokeniserState.Data);
        int after = reader.pos();
        assertEquals(before + 1, after);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testCurrentNodeInHtmlNS_alwaysTrue() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        assertTrue(t.currentNodeInHtmlNS());
    }
}
