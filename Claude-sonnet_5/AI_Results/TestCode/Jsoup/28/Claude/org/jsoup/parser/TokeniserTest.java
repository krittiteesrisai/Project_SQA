package org.jsoup.parser; // ต้องอยู่ package เดียวกันเพื่อเข้าถึง package-private members

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserTest {

    // ---------- 1. Constructor / getState ----------

    @Test
    public void testInitialStateIsData() {
        // ASSUMPTION: TokeniserState.Data ถูกยืนยันจากซอร์สจริง (field initializer)
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        assertEquals(TokeniserState.Data, t.getState());
    }

    // ---------- 2. transition() / advanceTransition() ----------

    @Test
    public void testTransitionChangesState() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.transition(TokeniserState.Data);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testAdvanceTransitionAdvancesReaderAndState() {
        CharacterReader reader = new CharacterReader("ab");
        Tokeniser t = new Tokeniser(reader, ParseErrorList.noTracking());
        int posBefore = reader.pos();
        t.advanceTransition(TokeniserState.Data);
        assertEquals(posBefore + 1, reader.pos());
        assertEquals(TokeniserState.Data, t.getState());
    }

    // ---------- 3. emit(char)/emit(String) buffering + read() branch: charBuffer.length()>0 ----------

    @Test
    public void testReadReturnsBufferedCharactersBeforePendingToken() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.emit('a');
        t.emit("bc");

        Token.Tag pendingTag = t.createTagPending(true);
        Token.StartTag startTag = (Token.StartTag) pendingTag;
        t.emit(startTag); // isEmitPending = true, แต่ charBuffer ยังมี "abc"

        // branch: charBuffer.length() > 0  -> true
        Token first = t.read();
        assertTrue(first instanceof Token.Character);

        // branch: charBuffer.length() > 0  -> false (ว่างแล้ว) -> คืน emitPending
        Token second = t.read();
        assertSame(startTag, second);
    }

    // ---------- 4. emit(Token): Validate.isFalse branch ----------

    @Test(expected = IllegalArgumentException.class)
    // ASSUMPTION: Validate.isFalse โยน IllegalArgumentException (ไม่ได้แสดงซอร์สของ Validate มาให้)
    public void testEmitTokenWhilePendingThrows() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        Token.Tag tag1 = t.createTagPending(true);
        t.emit((Token.StartTag) tag1); // ครั้งแรกสำเร็จ, isEmitPending = true

        Token.Tag tag2 = t.createTagPending(true);
        t.emit((Token.StartTag) tag2); // ควร throw เพราะยังไม่ได้ read() ค่าเดิม
    }

    // ---------- 5. emit(Token): StartTag + selfClosing branch, และ read() self-closing-not-acknowledged branch ----------

    @Test
    public void testSelfClosingNotAcknowledgedTriggersErrorOnNextRead() {
        ParseErrorList errors = ParseErrorList.tracking(10); // ASSUMPTION: factory method tracking(int)
        Tokeniser t = new Tokeniser(new CharacterReader(""), errors);

        Token.StartTag startTag = (Token.StartTag) t.createTagPending(true);
        startTag.selfClosing = true;
        t.emit(startTag); // branch: startTag.selfClosing == true -> selfClosingFlagAcknowledged=false

        assertEquals(0, errors.size());
        Token got = t.read(); // branch: !selfClosingFlagAcknowledged == true -> error()
        assertSame(startTag, got);
        assertEquals(1, errors.size());
    }

    @Test
    public void testAcknowledgeSelfClosingFlagPreventsError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader(""), errors);

        Token.StartTag startTag = (Token.StartTag) t.createTagPending(true);
        startTag.selfClosing = true;
        t.emit(startTag);
        t.acknowledgeSelfClosingFlag();

        Token got = t.read(); // branch: !selfClosingFlagAcknowledged == false
        assertSame(startTag, got);
        assertEquals(0, errors.size());
    }

    @Test
    public void testStartTagWithoutSelfClosingDoesNotSetFlag() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader(""), errors);

        Token.StartTag startTag = (Token.StartTag) t.createTagPending(true);
        // selfClosing default = false (ASSUMPTION: default field value false ตามซอร์ส Tag)
        t.emit(startTag);

        Token got = t.read();
        assertSame(startTag, got);
        assertEquals(0, errors.size());
    }

    // ---------- 6. emit(Token): EndTag + attributes branch ----------

    @Test
    public void testEmitEndTagWithAttributesTriggersError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader(""), errors);

        Token.EndTag endTag = (Token.EndTag) t.createTagPending(false);
        endTag.attributes = new Attributes();
        t.emit(endTag); // branch: endTag.attributes != null -> true

        assertEquals(1, errors.size());
    }

    @Test
    public void testEmitEndTagWithoutAttributesNoError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader(""), errors);

        Token.EndTag endTag = (Token.EndTag) t.createTagPending(false);
        // attributes เป็น null (ไม่ตั้งค่า)
        t.emit(endTag); // branch: endTag.attributes != null -> false

        assertEquals(0, errors.size());
    }

    // ---------- 7. createTagPending branches (start = true/false) ----------

    @Test
    public void testCreateTagPendingStartTrue() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        Token.Tag tag = t.createTagPending(true);
        assertTrue(tag instanceof Token.StartTag);
        assertSame(tag, t.tagPending);
    }

    @Test
    public void testCreateTagPendingStartFalse() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        Token.Tag tag = t.createTagPending(false);
        assertTrue(tag instanceof Token.EndTag);
        assertSame(tag, t.tagPending);
    }

    // ---------- 8. createCommentPending/emitCommentPending, createDoctypePending/emitDoctypePending ----------

    @Test
    public void testCreateAndEmitCommentPending() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.createCommentPending();
        assertNotNull(t.commentPending);
        assertTrue(t.commentPending instanceof Token.Comment);

        t.emitCommentPending();
        Token got = t.read();
        assertSame(t.commentPending, got);
    }

    @Test
    public void testCreateAndEmitDoctypePending() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.createDoctypePending();
        assertNotNull(t.doctypePending);
        assertTrue(t.doctypePending instanceof Token.Doctype);

        t.emitDoctypePending();
        Token got = t.read();
        assertSame(t.doctypePending, got);
    }

    // ---------- 9. createTempBuffer ----------

    @Test
    public void testCreateTempBufferInitializesEmptyBuffer() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        assertNull(t.dataBuffer); // ยังไม่ถูกสร้าง (ตามซอร์ส: ไม่มี initializer)
        t.createTempBuffer();
        assertNotNull(t.dataBuffer);
        assertEquals(0, t.dataBuffer.length());
    }

    // ---------- 10. isAppropriateEndTagToken / appropriateEndTagName ----------

    @Test
    public void testIsAppropriateEndTagToken_NoLastStartTag() {
        // branch: lastStartTag == null -> return false (ก่อนแม้แต่แตะ tagPending)
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        assertFalse(t.isAppropriateEndTagToken());
    }

    @Test(expected = NullPointerException.class)
    public void testAppropriateEndTagName_NoLastStartTag_ThrowsNPE() {
        // ตามซอร์ส: return lastStartTag.tagName; -> ไม่มีการเช็ค null -> คาด NPE จริง
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        t.appropriateEndTagName();
    }

    @Test
    public void testIsAppropriateEndTagToken_MatchingName_TrueBranch() {
        Tokeniser t = new Tokeniser(new CharacterReader("<div></div>"), ParseErrorList.noTracking());
        t.read(); // StartTag div -> ตั้ง lastStartTag
        t.read(); // EndTag div -> ตั้ง tagPending

        assertTrue(t.isAppropriateEndTagToken());
        assertEquals("div", t.appropriateEndTagName());
    }

    @Test
    public void testIsAppropriateEndTagToken_DifferentName_FalseBranch() {
        Tokeniser t = new Tokeniser(new CharacterReader("<div></span>"), ParseErrorList.noTracking());
        t.read(); // StartTag div
        t.read(); // EndTag span

        assertFalse(t.isAppropriateEndTagToken());
    }

    // ---------- 11. error(TokeniserState) / eofError(TokeniserState) ----------

    @Test
    public void testErrorAddsToTrackingList() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("x"), errors);
        t.error(TokeniserState.Data);
        assertEquals(1, errors.size());
    }

    @Test
    public void testEofErrorAddsToTrackingList() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser t = new Tokeniser(new CharacterReader("x"), errors);
        t.eofError(TokeniserState.Data);
        assertEquals(1, errors.size());
    }

    @Test
    public void testErrorNotAddedWhenNoTracking() {
        // branch: errors.canAddError() == false (noTracking -> maxSize=0)
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser t = new Tokeniser(new CharacterReader("x"), errors);
        t.error(TokeniserState.Data);
        t.eofError(TokeniserState.Data);
        assertEquals(0, errors.size());
    }

    // ---------- 12. currentNodeInHtmlNS ----------

    @Test
    public void testCurrentNodeInHtmlNSAlwaysTrue() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        assertTrue(t.currentNodeInHtmlNS());
    }

    // ---------- 13. consumeCharacterReference: guard clauses ----------

    @Test
    public void testConsumeCharacterReference_EmptyReaderReturnsNull() {
        Tokeniser t = new Tokeniser(new CharacterReader(""), ParseErrorList.noTracking());
        assertNull(t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_AdditionalAllowedCharacterMatches() {
        Tokeniser t = new Tokeniser(new CharacterReader("&amp;"), ParseErrorList.noTracking());
        assertNull(t.consumeCharacterReference(Character.valueOf('&'), false));
    }

    @Test
    public void testConsumeCharacterReference_MatchesAnyDisallowedChar() {
        Tokeniser t = new Tokeniser(new CharacterReader(" rest"), ParseErrorList.noTracking());
        assertNull(t.consumeCharacterReference(null, false));
    }

    // ---------- 14. consumeCharacterReference: numeric branch ----------

    @Test
    public void testConsumeCharacterReference_NumericNoNumerals() {
        Tokeniser t = new Tokeniser(new CharacterReader("#;"), ParseErrorList.noTracking());
        assertNull(t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_NumericDecimalMissingSemicolon() {
        Tokeniser t = new Tokeniser(new CharacterReader("#65"), ParseErrorList.noTracking());
        assertEquals(Character.valueOf('A'), t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_NumericHexWithSemicolon() {
        Tokeniser t = new Tokeniser(new CharacterReader("#x41;"), ParseErrorList.noTracking());
        assertEquals(Character.valueOf('A'), t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_NumericNumberFormatExceptionCaught() {
        // ตัวเลขยาวเกิน Integer range -> NumberFormatException -> charval = -1
        Tokeniser t = new Tokeniser(new CharacterReader("#99999999999999;"), ParseErrorList.noTracking());
        assertEquals(Character.valueOf(Tokeniser.replacementChar), t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_NumericOutOfUpperRange() {
        Tokeniser t = new Tokeniser(new CharacterReader("#x110000;"), ParseErrorList.noTracking());
        assertEquals(Character.valueOf(Tokeniser.replacementChar), t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_NumericUpperBoundaryValid() {
        // ขอบบนสุดที่ยังถูกต้อง: 0x10FFFF
        Tokeniser t = new Tokeniser(new CharacterReader("#1114111;"), ParseErrorList.noTracking());
        // (char) 0x10FFFF ล้นขนาด 16-bit char -> ทอนเป็น 0xFFFF ตามพฤติกรรมจริงของโค้ด
        assertEquals(Character.valueOf('\uFFFF'), t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_SurrogateLowerBoundInvalid() {
        Tokeniser t = new Tokeniser(new CharacterReader("#xD800;"), ParseErrorList.noTracking());
        assertEquals(Character.valueOf(Tokeniser.replacementChar), t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_SurrogateUpperBoundInvalid() {
        Tokeniser t = new Tokeniser(new CharacterReader("#xDFFF;"), ParseErrorList.noTracking());
        assertEquals(Character.valueOf(Tokeniser.replacementChar), t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_JustBelowSurrogateValid() {
        Tokeniser t = new Tokeniser(new CharacterReader("#xD7FF;"), ParseErrorList.noTracking());
        assertEquals(Character.valueOf('\uD7FF'), t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_JustAboveSurrogateValid() {
        Tokeniser t = new Tokeniser(new CharacterReader("#xE000;"), ParseErrorList.noTracking());
        assertEquals(Character.valueOf('\uE000'), t.consumeCharacterReference(null, false));
    }

    // ---------- 15. consumeCharacterReference: named branch ----------

    @Test
    // ASSUMPTION: "amp" เป็น legacy named entity ที่ jsoup รู้จักโดยไม่ต้องมี ';' (ความรู้ทั่วไปของ HTML5 entities)
    public void testConsumeCharacterReference_NamedFoundWithSemicolon() {
        Tokeniser t = new Tokeniser(new CharacterReader("amp;"), ParseErrorList.noTracking());
        assertEquals(Character.valueOf('&'), t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_NamedFoundMissingSemicolon() {
        Tokeniser t = new Tokeniser(new CharacterReader("amp "), ParseErrorList.tracking(10));
        assertEquals(Character.valueOf('&'), t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_NamedNotFound() {
        Tokeniser t = new Tokeniser(new CharacterReader("zzzjk;"), ParseErrorList.noTracking());
        assertNull(t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_InAttributeRejectedByTrailingChar() {
        // branch: inAttribute && matchesAny('=','-','_') -> true -> rewind, return null
        Tokeniser t = new Tokeniser(new CharacterReader("amp=val"), ParseErrorList.noTracking());
        assertNull(t.consumeCharacterReference(null, true));
    }

    @Test
    public void testConsumeCharacterReference_InAttributeNotRejectedWhenSafeFollower() {
        // branch: inAttribute == true แต่ follower ไม่เป็น letter/digit/=/-/_  -> ไม่ reject
        Tokeniser t = new Tokeniser(new CharacterReader("amp;"), ParseErrorList.noTracking());
        assertEquals(Character.valueOf('&'), t.consumeCharacterReference(null, true));
    }

    // ---------- 16. read(): สถานการณ์จริงผ่าน state machine (integration) ----------

    @Test
    public void testReadFullSequenceStartTextEndTag() {
        Tokeniser t = new Tokeniser(new CharacterReader("<p>Hi</p>"), ParseErrorList.noTracking());

        Token first = t.read();
        assertTrue(first instanceof Token.Tag);
        assertEquals("p", ((Token.Tag) first).tagName);
        assertTrue(first instanceof Token.StartTag);

        Token second = t.read();
        assertTrue(second instanceof Token.Character);

        Token third = t.read();
        assertTrue(third instanceof Token.EndTag);
        assertEquals("p", ((Token.Tag) third).tagName);
    }
}
